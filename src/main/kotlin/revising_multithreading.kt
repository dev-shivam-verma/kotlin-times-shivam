
fun main(){
    println("This programme illustrate a method by which we can perform multithreading")
    var t1 = thread()
    t1.start()
    var t2 = thread2()
    t2.start()
}




class thread2() : Thread(){
    override fun run() {
        var c= 0
        while(c<100){
            println("$c shivam is doing very very very very very good")
            c++
        }
    }
}
class thread() : Thread(){
    override fun run() {
        var c= 0
        while(c<100){
            println("$c shivam is doing very good")
            c++
        }
    }

}