package week1_assignment.week1_assignment.domain

import java.util.*

data class LiveUser (
    val id: Long,
    val name: String,
    val part: String

    ) {

    // 데이터클래스 멤버함수
    fun introduce() = "이름: ${name} 파트 ${part}"

    fun isNameSame(other:String) = name == other
    fun isUserEqual(otherName : String, otherPart: String) = otherName == name && otherPart == part
    fun isIdEqual(otherId: Long) = otherId === id


}