import javax.lang.model.element.Element

fun main(){
    var a = listOf(1,2,3,4,5,5)
    var b = 4
    println(LinearSearch(a,b))
    println(LinearSearch(a,100))
}

fun <T> LinearSearch(list : List<T>, element : T):Int {
    return if(element in list)
        list.indexOf(element)
    else
        -1
}