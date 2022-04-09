import javax.print.DocFlavor
import kotlin.test.assertTrue

fun main(){

    // 제네릭?? 이게??? 맞나????
    var stack1 = KStack3<Int>()

    stack1.push(1)
    println(stack1.size())

    stack1.pop()

    stack1.push(2)
    println(stack1.size())

    stack1.push(3)
    println(stack1.size())

    println( stack1.find(5))
    println(stack1.find(3))


}

class KStack3<T> (){

    var stack : ArrayList<T> = arrayListOf()

    fun push(element: T){
        stack.add(element)
//        println("${element} 추가됨. 현재 스택 상태: ${stack}")
    }

    fun pop(): T? { // 스택에 데이터가 없는 경우 어떻게 할 지?

        if (stack.size <= 0){
            println("스택에 데이터가 없습니다 -1 반환")
            return null
        } else {

        var target = stack[0]
        stack.removeAt(0)
//        println("${target} 삭제됨. 현재 스택 상태: ${stack}")
        return target
        }

    }

    fun size() : Int {

        return stack.size

    }

    fun find (element : T) : Boolean{

//        val param = {x:T -> x === element}
//
//        return stack.find(param) !== null

        // 이진탐색..?
        var l = 0
        var r = stack.size -1

        while (l <= r){
            var m = (l + r) / 2

            if (stack.get(m).toString() == element.toString()){
                return true
            } else if (stack.get(m).toString() <= element.toString()) {
                l = m + 1
            } else {
                r = m - 1
            }
        }

        return false

    }

}