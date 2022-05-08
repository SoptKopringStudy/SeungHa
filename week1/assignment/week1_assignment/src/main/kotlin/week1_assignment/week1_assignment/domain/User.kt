package week1_assignment.week1_assignment.domain

import java.util.*

data class User (
    var id: UUID,
    var name: String,
    var part: String
) {
    fun introduce() = "이름 : ${name} 파트: ${part}"
    
    // 도메인에 비교로직 넣어줌
    fun isNameSame(other:String) = name == other
    fun isUserEqual(otherName : String, otherPart: String) = otherName == name && otherPart == part
    fun isIdEqual(otherId: UUID) = otherId === id

}