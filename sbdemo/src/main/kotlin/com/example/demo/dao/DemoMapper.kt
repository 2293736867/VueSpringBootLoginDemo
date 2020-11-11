package com.example.demo.dao

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.example.demo.entity.User
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface DemoMapper :BaseMapper<User>{
    @Select("select * from user where username=#{username} and password = #{password}")
    fun selectByUsernameAndPassword(username:String,password:String):List<User>
}