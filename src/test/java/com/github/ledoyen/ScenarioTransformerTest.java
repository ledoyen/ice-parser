package com.github.ledoyen;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.IntStream;

import org.junit.Test;

public class ScenarioTransformerTest {
    
    private ScenarioTransformer<Node, Node> scenarioTransformer = new ScenarioTransformer<>(
            nodes -> new Node.Branch(null, nodes),
            (line, nodes) -> {
                if(nodes.isEmpty()) {
                    return new Node.Leaf(line.withoutGwtKeyword());
                } else {
                    return new Node.Branch(line.withoutGwtKeyword(), nodes);
                }
            }
    );
    
    @Test
    public void one_level_scenario() {
        Lines lines = Parsers.FRENCH.parser.toLines(Scenarios.ONE_LEVEL.rawScenario);
        Step.Scenario scenario = new ScenarioBuilder().build(lines);

        Node rootNode = scenarioTransformer.transform(scenario);
        
        assertThat(rootNode).isNotNull();
        assertThat(rootNode.leaf()).isFalse();
        assertThat(rootNode.nodes()).hasSize(4);

        IntStream.range(0, 4).forEach(i ->
                assertThat(rootNode.nodes().get(i).leaf()).isTrue()
        );
    }

    @Test
    public void two_levels_scenario() {
        Lines lines = Parsers.FRENCH.parser.toLines(Scenarios.TWO_LEVELS.rawScenario);
        Step.Scenario scenario = new ScenarioBuilder().build(lines);

        Node rootNode = scenarioTransformer.transform(scenario);

        assertThat(rootNode).isNotNull();
        assertThat(rootNode.leaf()).isFalse();
        assertThat(rootNode.nodes()).hasSize(2);

        assertThat(rootNode.nodes().get(0).nodes()).hasSize(2);
        assertThat(rootNode.nodes().get(1).leaf()).isTrue();
    }
}
