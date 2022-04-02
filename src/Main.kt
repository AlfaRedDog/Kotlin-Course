import java.util.Scanner
fun comparison(a: Int, b: Int): Char {
    if(a < b)
        return('<')
    if(a > b)
        return('>')
    return('=')
}
fun doubleMultiplication(a: Int, b:Int, c:Int) = a * b * c
fun main(args: Array<String>){
    //1
    val reader1 = Scanner(System.`in`)
    val name = reader1.nextLine()
    val age = reader1.nextInt()
    println("Привет, " + name + "! Вам " + age)

    //2
    val num1 = 30
    val num2 = 20
    println(comparison(num1, num2))

    //3
    println(doubleMultiplication(3, 2, 4))


    //4
    val reader4 = Scanner(System.`in`)
    val a = reader4.nextInt()
    val b = reader4.nextInt()
    if(a % 2 == 0)
        println(a)
    else
        println(b)

    //5
    val reader5 = Scanner(System.`in`)
    val day = reader5.nextInt()
    when{
        day == 1 -> println("Понедельник")
        day == 2 -> println("Вторник")
        day == 3 -> println("Среда")
        day == 4 -> println("Четверг")
        day == 5 -> println("Пятница")
        day == 6 -> println("Суббота")
        day == 7 -> println("Воскресенье")
        else -> print("Wrong Number")
    }
}