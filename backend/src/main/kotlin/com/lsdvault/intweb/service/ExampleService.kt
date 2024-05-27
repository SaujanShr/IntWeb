package com.lsdvault.intweb

import org.springframework.stereotype.Service

@Service
interface ExampleService {
    fun exampleService(name : String): String
}