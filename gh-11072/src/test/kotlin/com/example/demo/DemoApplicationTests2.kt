package com.example.demo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = DEFINED_PORT)
@TestPropertySource(
    properties = arrayOf(
        "bar=quux"
    )
)
class DemoApplicationTests2 {
    @Test
    fun contextLoads() {
    }
}
