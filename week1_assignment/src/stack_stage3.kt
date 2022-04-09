import javax.print.DocFlavor
import kotlin.reflect.typeOf
import kotlin.test.assertTrue

fun main(){

    var stack1 = KStack3<Int>()

    stack1.push(1)
    println(stack1.size())

    stack1.pop()
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
    }

    fun pop(): T? {

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

    fun find (element : T) : Boolean{

        var l = 0
        var r = stack.size -1

        while (l <= r) {
            var m = (l + r) / 2

            if (stack.get(m) === element) {
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


