package com.hadihariri.kotlincourse.functions

import jdk.nashorn.internal.ir.annotations.Immutable

/**
 * Created by hadihariri on 24/08/16.
 */

/*fun hello(): Unit{
    println("hello")
}

fun throwingException(): Nothing{
    throw Exception("this function throws an exception")
}

fun returnedAFour(): Int {
    return 4
}

fun takingString(name: String){

}

fun sum(x: Int, y: Int, z: Int = 0, w: Int = 0) = x + y + z + w

fun printDetails(name: String, email: String = "", phone: String){
    println("name: $name, email: $email, phone: $phone")
}

fun printStrings(vararg args: String){
    reallyPrintingStrings(*args)
}

private fun reallyPrintingStrings(vararg args: String) {
    for (arg in args) {
        println(arg)
    }
}

fun main(args: Array<String>){
    hello()
    val returned = returnedAFour()
    sum(1, 2, 3)
    sum(1, 2)
    printDetails("hadi", phone = "054324")
    printStrings("toto","titi", "tata")

}*/


fun hello() {
    println("salut")
}

fun returnsAFour(): Int{
    return 4
}

fun takingAString(name: String){
    println(name)
}

fun sum(x: Int, y: Int, z: Int = 0, w: Int = 0) = x + y - z + w

fun printStrings(vararg strings: String){
    reallyPrintingStrings(*strings)
}

private fun reallyPrintingStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}


fun main(args: Array<String>){
    printStrings("1", "2", "3")

    val listePays : MutableList<String> =
            listOf<String>("France", "Allemagne")
                    .toMutableList()
    listePays.add("Belgique")




}


