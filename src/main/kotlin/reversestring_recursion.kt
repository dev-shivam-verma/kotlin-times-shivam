

fun reversestring(a : String) : String{
    //base condition in which the a will passed empty
    if(a == ""){
        return ""
    }
    //recursion for adding last character to first
    return a[a.length - 1] + reversestring(a.substring(0,(a.length)-1))
}


fun main(){

    //calling the main function
    println(reversestring("shivam verma"))
}