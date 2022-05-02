package week1.week1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import week1.week1.stack.stack3

@SpringBootApplication
class Week1Application

fun main(args: Array<String>) {


	var stack = stack3<Char>()
	var list : ArrayList<String> = arrayListOf<String>()


	var n = readLine()!!.toInt()
	for (i in 1..n){

		var inputs = readLine()!!.toString()
		var rst = 0

		for (input in inputs){

			stack.push(input)
			rst += if (input == ')') -1 else 1

			if (rst < 0) {
				list.add("NO")
				break
			}

		}

		if (rst === 0) {
			list.add("YES")
		} else if (rst > 0) {
			list.add("NO")
		}
	}

	list.forEach{ println(it)}
}
