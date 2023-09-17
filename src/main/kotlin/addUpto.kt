fun main() {
    println("Enter a no you want to add upto: ")
    var a = readln().toInt()
    println("The sum is ${addUpto(a)}")
}

fun addUpto(a: Int): Int {
    var sum: Int = 0
    for (i in 1..a) {
        sum += i
    }
    return sum
}
