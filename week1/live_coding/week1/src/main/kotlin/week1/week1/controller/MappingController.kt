package week1.week1.controller

import org.springframework.web.bind.annotation.*
import week1.week1.dto.UserDto

@RestController
@RequestMapping("/mapping")
class MappingController {

    @PostMapping("")
    fun postUser(@RequestBody userDto: UserDto) = userDto.name

    @PutMapping("")
    fun putUser(@RequestBody userDto: UserDto) = userDto

    @DeleteMapping
    fun deleteUser(@RequestBody userDto: UserDto) = "삭제 성공"

}