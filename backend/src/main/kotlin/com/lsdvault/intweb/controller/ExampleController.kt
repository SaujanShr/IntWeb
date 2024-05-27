package com.lsdvault.intweb

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

import com.lsdvault.intweb.ExampleService

@RestController
class ExampleController(
    val exampleService: ExampleService
) {
    // Example working url: http://localhost:8080/example?name=John
    // This can also be a model class, not just a string!
    @RequestMapping("/example")
    fun helloName(@RequestParam("name") name : String): String {
        return exampleService.exampleService(name)
    }
}