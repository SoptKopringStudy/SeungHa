import javax.print.DocFlavor
import kotlin.test.assertTrue

fun main(){

    // 제네릭?? 이게??? 맞나????
    var stack1 = KStack2<String>()

    stack1.push("첫번째")
    println(stack1.size())

    stack1.pop()

    stack1.push("두번째")
    println(stack1.size())

    stack1.push("세번째")
    println(stack1.size())

    println( stack1.find("두번째"))
    println(stack1.find("다섯번째"))


}

class KStack2<T> (){

    var stack : ArrayList<T> = arrayListOf()

    fun push(element: T){
        stack.add(element)
//        println("${element} 추가됨. 현재 스택 상태: ${stack}")
    }

    fun pop(): T { // 스택에 데이터가 없는 경우 어떻게 할 지?

//        if (stack.size <= 0){
//            println("스택에 데이터가 없습니다 -1 반환")
//            return T
//        } else {

            var target = stack[0]
            stack.removeAt(0)
//            println("${target} 삭제됨. 현재 스택 상태: ${stack}")
            return target
//        }

    }

    fun size() : Int {

        return stack.size

    }

    fun find (element : T) : Boolean{
        for ( data in stack ) {
            if (element == data){
                return true
            }
        }
        return false
    }


}