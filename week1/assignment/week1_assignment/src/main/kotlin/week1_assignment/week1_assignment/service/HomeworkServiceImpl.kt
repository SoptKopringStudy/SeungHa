package week1_assignment.week1_assignment.service

import org.springframework.stereotype.Service
import week1_assignment.week1_assignment.domain.LiveUser
import week1_assignment.week1_assignment.domain.PostUserDto
import week1_assignment.week1_assignment.domain.User
import java.lang.IllegalStateException

@Service
class HomeworkServiceImpl: HomeworkService {

    private val userList: MutableList<LiveUser> = mutableListOf()

    override fun getAllUser(): String = if (userList.isEmpty()) "유저가 없습니다" else userList.joinToString { it.name }

    override fun getUserByName(name: String): Result<String> {
        return when (val user = userList.find { it.isNameSame(name) }){
            null -> Result.failure(IllegalStateException("${name}을 가진 유저가 없습니다"))
            else -> Result.success(user.introduce())
        }
    }

    override fun getUserByInfo(name: String, part: String): Result<String> {
        return when (val user = userList.find { it.isUserEqual(name, part) }){
            null -> Result.failure(IllegalStateException("조회 실패"))
            else -> Result.success("조회 성공")
        }
    }

    override fun deleteUser(id: Long): Result<String> {
        return when (val user = userList.find { it.isIdEqual(id) }){
            null -> Result.failure(IllegalStateException("삭제 실패"))
            else -> Result.success("조회 성공")
        }
    }


}