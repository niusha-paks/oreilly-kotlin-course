package com.hadihariri.kotlincourse.basics

/**
 * Created by hadihariri on 24/08/16.
 */


fun main(args: Array<String>) {

    val intRange = 1..100

    for(a in intRange){

    }

    for(b in 100 downTo 1 step 5){
        //println(b)
    }

    val capitals = listOf("Paris", "Berlin", "Bruxelles")

    for(capital in capitals){
        //println(capital)
    }

    var i = 100
    while (i > 0){
        i--
    }

    var x = 10
    do{
        x--
    //    println(x)
    } while (x > 0)

    toto@ for (i in 1 .. 100){
        for(j in 1 .. 100){
            if(j % i == 0){
                break@toto
            }
        }
    }











    /*for(a in 1 .. 100){
        println(a)
    }

    val numbers = 1 .. 100

    for(a: Int in numbers){
        println(a)
    }

    for (a in 100 downTo 1){
        println(a)
    }

    for (a in 100 .. 1){
        println(a)
    }

    for(b in 100 downTo 1 step 5){
        println(b)
    }

    val capitals = listOf("London", "Paris", "Rome", "Madrid")
    for(capital in capitals){
        println(capital)
    }

    var i = 100
    while(i > 0){
        i--
        println(i)
    }

    var x = 10
    do{
        x--
    } while (x > 10)

    loop@ for(i in 1 .. 100){
        for (j in 1 .. 100){
            println("$i, $j")
            if(j % i == 0){
                break@loop
            }
        }
    }*/



}

