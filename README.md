# ICE-parser

Parser for ICE language, similar to Gherkin, but allowing nested steps.

Parsing such a document
```
Given a blue dog
    Given a dog
    And the color is blue
When the color is changed to red
Then the dog is red
    the color is red
```

Can be done through :

```java
InputStream rawScenario = ...

IceLanguageParser parser = new IceLanguageParser(Sets.newHashSet("Given", "When", "Then", "And"));
ParsingResult parsingResult = parser.parse(rawScenario);
Scenario scenario = parsingResult.getScenario();
```

Each `Scenario` and `Step` objects have a `Location` attribute containing the line and column of their position in the original **scenario** document.
