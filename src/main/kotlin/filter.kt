

fun main(){
    var a = listOf<Int>(1,2,3,4,5,6,7,8)
    val b = a.filter { it % 2 == 0 }
    println(b)
}

