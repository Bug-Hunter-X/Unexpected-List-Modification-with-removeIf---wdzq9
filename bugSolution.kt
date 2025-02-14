fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    list.removeAll(evenNumbers)
    println(list) 
    //Alternative solution using filter 
    val oddNumbers = list.filter { it % 2 != 0 }
    println(oddNumbers)
}