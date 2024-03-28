
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val myStudentsArray: Array<String> = arrayOf("Peter", "Vasya", "Tolyan", "Lyokha")

    myStudentsArray[0] = "Anna"

    println("First cockroach: ${myStudentsArray[0]}")
    println("Second cockroach:${myStudentsArray[1]}")
    println("Third cockroach: ${myStudentsArray[2]}")
    println("Fourth cockroach: ${myStudentsArray[3]}")

    val myArray: Array<Array<Int>> = arrayOf(
        arrayOf( 1, 2 , 3, 4, 5),
        arrayOf(6, 7, 8, 9, 10),
        arrayOf(11, 12, 13, 14, 15)
    )
println(myArray[0][4])
println(myArray[2][4])
}


