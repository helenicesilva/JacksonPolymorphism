package br.com.helenice.jacksonTest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class JacksonTestApplication

fun main(args: Array<String>) {
	runApplication<JacksonTestApplication>(*args)
}
