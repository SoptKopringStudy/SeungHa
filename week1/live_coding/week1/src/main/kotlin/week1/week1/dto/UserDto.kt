package week1.week1.dto

// data class
// toString, equals, hashCode가 기본적으로 구현되어 있음
data class UserDto(
    val name: String,
    val age: Int
)

fun printUser(userDto: UserDto){
    println("${userDto}") // UserDto(name: 임승하) 이렇게 출력됨
}
