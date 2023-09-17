

fun main(){
    var a = readln()
    var b = a.split(Regex("[ ,]+"))
    var listofint = b.map { it.toInt() }
    var oddlistof = listofint.filter { it -> it % 2 != 0  }
    println(oddlistof)

}