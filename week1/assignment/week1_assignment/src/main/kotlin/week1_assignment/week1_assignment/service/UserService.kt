package week1_assignment.week1_assignment.servifindUsersce

import org.springframework.stereotype.Service
import week1_assignment.week1_assignment.domain.User
import week1_assignment.week1_assignment.repository.UserRepository
import java.util.*

@Service
class UserService {

    var userRepository: UserRepository = UserRepository();

    fun findUserList(): List<String> = userRepository.findUserList()

    fun findUserByName(userName: String) = userRepository.findUserByName(userName)

    fun addUser(user: User) = userRepository.addUser(user)

    fun updateUser(newUser: User) = userRepository.updateUser(newUser)

    fun deleteUser(id: UUID) = userRepository.deleteUser(id)
}