package com.example.demo.response

class DemoResponseBuilder {
    private var response = DemoResponse()

    fun data(t:Any): DemoResponseBuilder
    {
        response.data = t
        return this
    }
    fun code(t:Int): DemoResponseBuilder
    {
        response.code = t
        return this
    }
    fun message(t:String): DemoResponseBuilder
    {
        response.message = t
        return this
    }
    fun build() = response
}