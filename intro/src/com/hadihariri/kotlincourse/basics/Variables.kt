
fun main(args: Array<String>){

    val streetNumber = 10

    println(streetNumber)

    val streetName : String = "Avenue Jean Jaures"

    //streetName = "Rue des écoles"

    var myLong = 10L
    var myFloat = 100F
    var myHex = 0x0F
    var myBinary = 0b01

    var myInt = 100
    var myLongAgain : Long = myInt.toLong()

    var myChar = 'A'
    var myString = "toto"

    var myEscapeString = "Salut \n"

    var myMultipleString = """
        Bonjour
        Voici une nouvelle ligne
    """

    val year = 10
    val message = "A decade is $year years"

    val name = "Marie"
    val anotherMessage = "Lenght of the name is ${name.length}"

    println(anotherMessage)

}