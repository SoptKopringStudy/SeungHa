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
    println(stack1.find(1))


}

class KStack constructor() {

    var stack : ArrayList<Int> = arrayListOf()



    fun push(element: Int){
        stack.add(element)
    }

    fun pop(): Int? {
        
        if (stack.size <= 0){
            println("스택에 데이터가 없습니다")
            return null
        } else {

            var target = stack[0]
            stack.removeAt(0)
            return target
        }

    }

    fun size() : Int {

        return stack.size

    }

    fun find (element : Int) : Boolean{
        for ( data in stack ) {
            if (element === data){
                return true
            }
        }

        return false
    }


}