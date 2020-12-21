package com.github.jactor.junit;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.Test;

public class GreetJUnitVintageTest {

    @Test
    public void  shouldGreetTheWorld() {
        assertThat(new Greet().sayHello()).isEqualTo("Hello World!");
    }

    @Test
    public void shouldGreetPerson() {
        assertThat(new Greet("Tor Egil").sayHello()).isEqualTo("Hello Tor Egil!");
    }
}
