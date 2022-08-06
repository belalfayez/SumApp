import java.util.Scanner

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    //Welcome To the project

    //step one take an input from user
    val scr = Scanner(System.`in`)
    val name = scr.nextLine()
    println("Welcome $name to the project" )

    // step 2 take 2 numbers from user.
    println("kindly give us to numbers and you will get your sum!")
    val x = scr.nextInt()
    println("You entered $x")
    val y = scr.nextInt()
    println("You entered $y")
    val waitingMsg = "Here we are coming to the last point, waiting...  "
    println(waitingMsg)
    val sum = x + y
    when{
        (sum %2) ==0  ->{
            println("your sum is even number, here you are $sum")
        }
        (sum %2) !=0 ->{
            println("your sum is odd number, here you are $sum")
        }
    }
}