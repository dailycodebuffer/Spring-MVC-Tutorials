package com.dailycodebuffer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinDemoApplication

fun main(args: Array<String>) {
	runApplication<KotlinDemoApplication>(*args)
}
