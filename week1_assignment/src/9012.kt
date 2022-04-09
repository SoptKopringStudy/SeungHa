fun main(args: Array<String>){

    var stack1 = KStack3<Char>()
    var list : ArrayList<String> = arrayListOf<String>()


    var n = readLine()!!.toInt()
    for (i in 1..n){

        var inputs = readLine()!!.toString()
        var rst = 0

        for (input in inputs){

            stack1.push(input)
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