package week1.week1.stack

class stack3<T> {

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