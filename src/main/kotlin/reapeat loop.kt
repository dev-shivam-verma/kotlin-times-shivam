fun main(){
    var thread = Thread {
        var a =1
        repeat(100){
            a++
            println("shivam is great"+ a)
        }
    }

    var thread2 = Thread {
        var p =1
        repeat(100){
            p++
            println("shivam is great and more great"+ p)
        }
    }

    thread.start()
    thread2.start()
}