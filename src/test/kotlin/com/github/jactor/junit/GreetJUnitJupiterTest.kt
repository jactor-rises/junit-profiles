package com.github.jactor.junit

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GreetJUnitJupiterTest {

    @Test
    fun `should greet the world`() {
        assertThat(Greet().sayHello()).isEqualTo("Hello World!")
    }

    @Test
    fun `should greet a person`() {
        assertThat(Greet("Tor Egil").sayHello()).isEqualTo("Hello Tor Egil!")
    }
}