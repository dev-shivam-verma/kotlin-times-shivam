fun main() {
    loop@
    for (i in 1..10) {
        for (x in 1..10) {
            if (i == 6) {
                break@loop
            }

            println(i)
        }
    }
}
