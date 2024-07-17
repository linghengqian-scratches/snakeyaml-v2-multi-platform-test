package com.lingh;

import org.junit.jupiter.api.Test;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.representer.Representer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SnakeYamlTest {

    @Test
    void testSnakeYaml() {
        TestRecord actual = new TestRecord();
        actual.setName("test");
        DumperOptions dumperOptions = new DumperOptions();
        dumperOptions.setLineBreak(DumperOptions.LineBreak.WIN);
        String s = new Yaml(new Representer(dumperOptions)).dumpAsMap(actual);
        assertThat(s, is("name: test" + "\r\n"));
    }

    static class TestRecord {
        private String name;

        @SuppressWarnings("unused")
        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
