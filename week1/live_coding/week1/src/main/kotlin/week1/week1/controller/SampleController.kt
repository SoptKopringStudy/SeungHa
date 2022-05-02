package week1.week1.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    // GET localhost:8080/
    @GetMapping("")
    fun printHelloWorld() = "Hello World!";

    // GET localhost:8080/introduce
    @GetMapping("/introduce")
    fun printMyself() = "저는 임승하고 23살입니다"

    // request 종류 3가지 - 1.Path 2.Query 3.RequestBody
    
    // 1.Path 요청
    @GetMapping("/introduce/{pathVariable}")
    fun printPathVariable(
        @PathVariable("pathVariable") pathVariable: String
    ) = "이름: ${pathVariable}"


    // http://localhost:8080/intro?name=임승하&age=11
    @GetMapping("/intro")
    fun printByQuery(
        @RequestParam("name") name: String,
        @RequestParam("age") age: String
    ) = "이름: ${name} 나이 ${age}"


}