class node(a: Int) {
    var data : Int = a
    var next_node: node? = null
}

class my_link() {
    var head: node? = null

    fun append(data: Int) {
        if (head == null) {
            head = node(data)
        } else {
            var current = head
            while (current?.next_node != null) {
                current = current?.next_node
            }
            current?.next_node = node(data)
        }
    }


    fun display(){
        var current = head
        while(current?.next_node != null){
            println("element -> ${current.data}")
            current = current.next_node
        }
        println("element -> ${current?.data}")
    }
}



fun main(){
    var my_linked : my_link = my_link()

    my_linked.append(1)
    my_linked.append(54)
    my_linked.append(34)
    my_linked.append(67)
    my_linked.append(3)
    my_linked.append(9)

    my_linked.display()

}