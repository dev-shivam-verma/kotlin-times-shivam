

fun fabonacci(limit : Int , List : MutableList<Int>): MutableList<Int>{
    if (List.size == limit){
        return List
    }
    List.add(List[List.size-1] + List[List.size-2])
    return fabonacci(limit,List)
}

fun main(){
    var my_list : MutableList<Int> = mutableListOf(1,2)
    println(fabonacci(10,my_list))
}