fun main() {
    println("Enter check String: ")
    var a = readln()
    if (a.uppercase() == a.reversed().uppercase()) {
        println("is palindrome directly")
    } else {
        var found = false
        for (i in 0..a.length - 1) {
            var new_check = a.removeRange(i..i)
            if (new_check.uppercase() in new_check.reversed().uppercase()) found = true
        }
        if (found) println("tolerent palindrome")
        else println("not an palindeome in any way")
    }

}