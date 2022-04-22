package week1.week1.stack

class stack1 {

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