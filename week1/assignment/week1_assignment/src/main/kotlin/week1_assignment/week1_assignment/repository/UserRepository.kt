package week1_assignment.week1_assignment.repository

import org.springframework.stereotype.Repository
import week1_assignment.week1_assignment.domain.User
import java.util.*

@Repository
class UserRepository {

    var userList = mutableListOf<User>()

    val user1: User = User(UUID.randomUUID(), "user1", "server")
    val user2: User = User(UUID.randomUUID(), "user2", "web")


    fun findUserList(): List<String> {

        userList.add(user1)
        userList.add(user2)

        var userNames = mutableListOf<String>()

        userList.forEach { user  ->
            userNames.add(user.name)
        }

//        for (user in userList){
//            userNames.add(user.name)
//        }

        return userNames
    }

    fun findUserByName (userName: String) : User?{

        userList.forEach{ user ->
            if (user.name == userName){
                return user
            }
        }

        return null
    }

    fun addUser(user: User) {
        userList.add(user)
        print(userList)
    }

    fun updateUser(newUser: User) {
        userList.forEach { user ->
            if (user.id == newUser.id) {
                newUser.name = user.name
                newUser.part = user.part
            }
        }
    }

    fun deleteUser(id: UUID): Boolean {
        userList.forEachIndexed { index, user ->
            if (user.id == id){
                userList.removeAt(index)
                return true
            }
        }

        return false
    }

}