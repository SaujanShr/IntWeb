package com.lsdvault.intweb

import org.springframework.stereotype.Service

import com.lsdvault.intweb.ExampleService

@Service
class ExampleServiceImpl : ExampleService {
    override fun exampleService(name : String): String {
        return "Hello $name!"
    }
}