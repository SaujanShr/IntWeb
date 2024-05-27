package com.lsdvault.intweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IntWebApplication

fun main(args: Array<String>) {
	runApplication<IntWebApplication>(*args)
}
