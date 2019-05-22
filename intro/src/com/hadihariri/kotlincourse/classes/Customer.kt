package com.hadihariri.kotlincourse.classes

import java.lang.IllegalArgumentException

open class Person (var age : Int = 0)
{

}

class Customer () : Person()
{
    constructor(a : Int) : this() {
        age = a
    }
    internal var mail:String = ""
        set(value) {
            if(!value.matches(Regex("([a-z])+@gmail.com")))
            {
                throw IllegalArgumentException("Must have a gmail address")
            }
            field = value
        }

    override fun toString() : String
    {
        return "age:$age, mail:$mail"
    }

    internal enum class TYPE (val value:Int){
        POOR(12),
        MEDIUM(347) {
            override fun toString() : String{
                return "classe moyenne"
            }
        },
        RICH(99)
    }
}

fun main(args:Array<String>)
{
    var c : Customer? = null
    //println(c!!.age)
    println(c?.age)
    println(checkNotNull(c))
    c = Customer(25)
    c.mail = "hugostephanbac@gmail.com"
    val e : Customer.TYPE = Customer.TYPE.POOR
    for(t in Customer.TYPE.values())
    {
        /*println(t.ordinal)
        println(t.value)
        println(t.name)
        println(t)*/
    }

    println(CustomerFactory.echo())
}

object CustomerFactory {
    fun echo () : String {
        return "hello"
    }
}