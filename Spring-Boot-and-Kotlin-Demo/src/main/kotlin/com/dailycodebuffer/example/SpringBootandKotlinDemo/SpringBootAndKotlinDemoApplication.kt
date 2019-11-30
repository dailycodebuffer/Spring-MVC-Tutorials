package com.dailycodebuffer.example.SpringBootandKotlinDemo

import com.dailycodebuffer.example.SpringBootandKotlinDemo.blog.BlogProperties
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class SpringBootAndKotlinDemoApplication

fun main(args: Array<String>) {
	runApplication<SpringBootAndKotlinDemoApplication>(*args)
	{
		setBannerMode(Banner.Mode.OFF)
	}
}
