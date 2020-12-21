package com.github.jactor.junit;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GreetJUnitJupiterTest {

    @Test
    @DisplayName("should greet the world")
    void shouldGreetTheWorld() {
        assertThat(new Greet().sayHello()).isEqualTo("Hello World!");
    }

    @Test
    @DisplayName("should greet a person")
    void shouldGreetPerson() {
        assertThat(new Greet("Tor Egil").sayHello()).isEqualTo("Hello Tor Egil!");
    }
}
