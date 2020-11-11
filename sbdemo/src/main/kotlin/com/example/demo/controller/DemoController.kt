package com.example.demo.controller

import com.example.demo.response.DemoResponse
import com.example.demo.entity.User
import com.example.demo.service.DemoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:8081")
class DemoController {
    @Autowired
    lateinit var service: DemoService

    @PostMapping("login")
    fun login(@RequestBody user: User): DemoResponse
    {
        return service.login(user.username, user.password)
    }
}