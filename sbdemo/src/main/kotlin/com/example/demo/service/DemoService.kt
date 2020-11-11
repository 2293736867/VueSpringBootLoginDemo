package com.example.demo.service

import com.example.demo.response.DemoResponse
import com.example.demo.response.DemoResponseBuilder
import com.example.demo.dao.DemoMapper
import com.example.demo.entity.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class DemoService
{
    @Autowired
    lateinit var mapper: DemoMapper

    fun login(username:String, password:String): DemoResponse
    {
        val result = mapper.selectByUsernameAndPassword(username,password).size
        if(result == 0)
            mapper.insert(User(username,password))
        return DemoResponseBuilder().code(if(result == 0) 1 else 2).message("").data(true).build()
    }
}