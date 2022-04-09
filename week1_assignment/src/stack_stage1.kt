import kotlin.test.assertTrue

fun main(){

    var stack1 = KStack()
    stack1.push(1)
    println(stack1.size())

    stack1.pop()

    stack1.pop()

    stack1.push(1)
    println(stack1.size())

    stack1.push(1)
    println(stack1.size())

    println( stack1.find(5))
    println(stack1.find(0))


}

class KStack constructor() {

    var stack : ArrayList<Int> = arrayListOf()



    fun push(element: Int){
        stack.add(element)
//        println("${element} 추가됨. 현재 스택 상태: ${stack}")
    }

    fun pop(): Int { // 스택에 데이터가 없는 경우 어떻게 할 지?
        
        if (stack.size <= 0){
//            println("스택에 데이터가 없습니다 -1 반환")
            return -1
        } else {

            var target = stack[0]
            stack.removeAt(0)
//            println("${target} 삭제됨. 현재 스택 상태: ${stack}")
            return target
        }

    }

    fun size() : Int {

        return stack.size

    }

    fun find (element : Int) : Boolean{
        for ( data in stack ) {
            if (element == data){
                return true
            }
        }

        return false
    }


}