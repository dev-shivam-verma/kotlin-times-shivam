

fun main(){
    println(if_range(2..6,1..10))
    println(if_range(0..8,1..10))
}

fun if_range( range1 : IntRange, range2 : IntRange): Boolean{
    return range1.first >= range2.first && range1.last <= range2.last
}
