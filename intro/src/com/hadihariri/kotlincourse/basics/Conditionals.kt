package com.hadihariri.kotlincourse.basics

/**
 * Created by hadihariri on 24/08/16.
 */


fun main(args: Array<String>) {

    /*var myString = "not empty"

    val resultIf = if(myString != ""){
        "Value"
    } else{
        "another string"
    }

    val result = "Value"
    val whenValue = when(result){
        "Value"-> {
            println("value")
            println("second statement")
            "Returning from first when case"
        }
        is String -> println("excelent")
        else -> println("it came to this ?")
    }

    println(whenValue)*/

    val result = "tutu"

    var resultIf = if(result == "toto"){
        "c'est bien toto."
    } else {
        "ce n'est pas toto."
    }

    println(resultIf)

    val whenResult = when(result){
        "toto" -> "salut je suis toto"
        "titi" -> "salut je suis titi"
        is String -> "ceci est bien une chaine de caracteres"
        else -> "je ne suis ni toto ni titi"
    }

    println(whenResult)



}