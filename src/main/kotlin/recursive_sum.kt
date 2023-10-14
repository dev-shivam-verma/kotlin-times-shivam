

fun sumUPTOn(n : Int , next : Int,sum : Int = 0): Int{
    require(n >= next){"please enter the calculation limit higher than start limit"}
    //base condition
    if(next == n){
        //final print
        return sum + n
    }
    //hypothetical expression for mid calculation
    return sumUPTOn(n,next+1,sum+next)
}

fun main(){
    //main function call and print of returned value
    println(sumUPTOn(3,1))
}