package com.github.ledoyen;

import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import com.google.common.collect.ImmutableList;

public class ScenarioTransformer<ROOT_NODE, NODE> {

    private final Function<List<NODE>, ROOT_NODE> rootNodeBuilder;
    private final BiFunction<Lines.Line, List<NODE>, NODE> nodeBuilder;

    public ScenarioTransformer(Function<List<NODE>, ROOT_NODE> rootNodeBuilder, BiFunction<Lines.Line, List<NODE>, NODE> nodeBuilder) {
        this.rootNodeBuilder = rootNodeBuilder;
        this.nodeBuilder = nodeBuilder;
    }
    
    public ROOT_NODE transform(Step.Scenario scenario) {
        ImmutableList.Builder<NODE> nodes = ImmutableList.builder();

        scenario.steps().forEach(step -> nodes.add(transform(step)));
        
        return rootNodeBuilder.apply(nodes.build());
    }

    private NODE transform(Step.MeaningfulStep step) {
        if(step.steps().isEmpty()) {
            return nodeBuilder.apply(step.line(), Collections.emptyList());
        } else {
            ImmutableList.Builder<NODE> nodes = ImmutableList.builder();

            step.steps().forEach(substep -> nodes.add(transform(substep)));

            return nodeBuilder.apply(step.line(), nodes.build()); 
        }
    }
}
