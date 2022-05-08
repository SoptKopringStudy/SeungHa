package week1_assignment.week1_assignment.service

import week1_assignment.week1_assignment.domain.PostUserDto

interface HomeworkService {

    fun getAllUser(): String

    fun getUserByName(name: String): Result<String>

    fun getUserByInfo(name: String, part: String): Result<String>

    // 일단 PostUserDto로 설정
    // post, put api 생략

    fun deleteUser(id: Long): Result<String>



}