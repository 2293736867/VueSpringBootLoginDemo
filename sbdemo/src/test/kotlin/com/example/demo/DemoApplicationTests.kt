package com.example.demo

import com.example.demo.service.DemoService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    lateinit var service: DemoService

    @Test
    fun contextLoads() {
        println(service.login("123", "456"))
    }

}
