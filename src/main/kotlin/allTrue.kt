

fun main(){
    var check_list = listOf(true,false,true)

    if( check_list.all{ it }){
        println("true")
    }else
        println("false")
}