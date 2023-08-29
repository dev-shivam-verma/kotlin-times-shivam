fun main(){
    try{
        print( 3 / 0)
    }catch (e : ArithmeticException){
        println("division by zero")
    }
}