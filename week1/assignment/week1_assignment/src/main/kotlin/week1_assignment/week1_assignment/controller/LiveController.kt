package week1_assignment.week1_assignment.controller

import org.springframework.web.bind.annotation.*
import week1_assignment.week1_assignment.domain.BaseResponse
import week1_assignment.week1_assignment.service.HomeworkService
import java.lang.RuntimeException


@RestController
@RequestMapping("/user2")
class LiveController (

    private val homeworkService: HomeworkService // 생성자 주입

){

    @GetMapping("/")
    fun getAllUsers() = homeworkService.getAllUser()

    @GetMapping("/{name}")
    fun getUserByName( @PathVariable("name") name: String ): BaseResponse<String> {

        homeworkService.getUserByName(name)
            .onSuccess { return BaseResponse.success(it) }
            .onFailure { return BaseResponse.failure(it.message ?: "해당 유저가 없습니다") }
        throw RuntimeException("Unreachable Code")

    }

    @GetMapping("/info/")
    fun getUserByInfo(
        @RequestParam("part") part: String,
        @RequestParam("name") name: String

    ): BaseResponse<String> {
        homeworkService.getUserByName(name)
            .onSuccess { return BaseResponse.success(it) }
            .onFailure { return  BaseResponse.failure(it.message ?: "해당 유저가 없습니다") }
        throw RuntimeException("Unreachable Code")
    }


    // PostMapping 생략. create할 때 userDto 안에 user.name = userDto.name 해주는 함수 만들어서 그거 호출

    // PutMapping 생략. 도메인 객체 자체를 @RequestBody로 받지 않는게 좋음
    // indexOfFirst - 조건에 맞는 가장 첫번째 객체 반환


    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable("id") id: Long) = homeworkService.deleteUser(id)
}