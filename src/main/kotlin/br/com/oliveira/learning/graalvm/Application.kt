package br.com.oliveira.learning.graalvm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(proxyBeanMethods = false)
class Application{
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<Application>(*args)
        }
    }
}
