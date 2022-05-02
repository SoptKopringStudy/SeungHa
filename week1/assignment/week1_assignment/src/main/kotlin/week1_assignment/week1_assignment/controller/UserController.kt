package week1_assignment.week1_assignment.controller

import org.springframework.web.bind.annotation.*
import week1_assignment.week1_assignment.domain.User
import week1_assignment.week1_assignment.domain.PostUserDto
import week1_assignment.week1_assignment.servifindUsersce.UserService
import java.util.*


@RestController()
@RequestMapping("/user")
class UserController {

    var userService: UserService = UserService();

    @GetMapping
    fun userList(): Any {

        val userList: List<String> = userService.findUserList()

        if (userList.isEmpty()){
            return "유저가 없습니다!"
        }
        return userList
    }

    @GetMapping("/name/{name}")
    fun findUser (@PathVariable name: String): String{

        val user: User? = userService.findUserByName(name)

        if (user == null){
            return "${name}을 가진 유저가 없습니다."
        }

        return "이름: ${user.name} 파트: ${user.part}"

    }

    // http://localhost:8080/user/info/part=server?name=user
    @GetMapping("/info/part={part}")
    fun queryTest (@RequestParam name: String): String{
        return "조회 성공"
    }

    @PostMapping
    fun addUser(@RequestBody postUserDto: PostUserDto) {

        val user: User = User(UUID.randomUUID(), postUserDto.name, postUserDto.part)
        userService.addUser(user)
    }

    @PutMapping
    fun updateUser(@RequestBody user: User) {
        
        val newUser: User = User(user.id, user.name, user.part)
        userService.updateUser(newUser)

    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: UUID): String{

        val rst:Boolean = userService.deleteUser(id)
        
        if (rst == true){
            return "삭제 성공"
        } else {
            return "해당 유저가 존재하지 않습니다"
        }
    }



}