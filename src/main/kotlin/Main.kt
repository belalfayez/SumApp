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
    println("Welcome " + name + "to the project" )


}