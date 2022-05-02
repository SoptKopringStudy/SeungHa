package week1.week1.stack

class stack2<T> {

    var stack : ArrayList<T> = arrayListOf()

    fun push(element: T){
        stack.add(element)
    }

    fun pop(): T? {

        if (stack.size <= 0){
            println("스택에 데이터가 없습니다 -1 반환")
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
        for ( data in stack ) {
            if (element === data){
                return true
            }
        }
        return false
    }
}