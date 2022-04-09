fun main(args: Array<String>){

    var stack1 = KStack3<Char>()


    var n = readLine()!!.toInt()
    for (i in 1..n){

        var inputs = readLine()!!.toString()
        var rst = 0

        for (input in inputs){

            stack1.push(input)
            rst += if (input == ')') -1 else 1

            if (rst < 0) {
                println("NO")
                break
            }

        }

        if (rst === 0) {
            println("YES")
        } else if (rst > 0) {
            println("NO")
        }


    }

}