package com

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RememberPwApplication

fun main(args: Array<String>) {
    runApplication<RememberPwApplication>(*args)
}