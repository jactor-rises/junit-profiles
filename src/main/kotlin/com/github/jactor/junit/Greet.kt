package com.github.jactor.junit

class Greet(private val name: String) {
    constructor(): this("World")

    fun sayHello() = "Hello $name!"
}
