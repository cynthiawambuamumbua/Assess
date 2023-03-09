fun main(){
    details("San Fransisco","San fransisco")
    var name="banana"
    println(name)
    var numbers=calculator(54,76)
    println(numbers)


}
//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun details(name1:String,name2:String){
    val name1="San Fransisco"
    val name2="San fransisco"
    if (name1.equals(name2))
        println(true)
        else
            println(false)
        }
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
    //Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
    fun name() {
        var x = "banana"
        println(x.get(0))
        println(x.get(1))
        println(x.get(2))
        println(x.get(3))
        println(x.get(4))
        println(x.get(5))
        println(x.get(6))
    }

//Write and call a function that takes in an array of strings, joins them all into
    //one string and returns it.
fun names(name1:String,name2: String) {
    var name1 = "Cynthia"
    var name2 = "Wambua"
    var names = (name1 + " " + name2)
    println(names)
}
    //Create a calculator class that is capable of the following functions:
   // (i) Addition of any 2 numbers
            //(ii) Subtraction between any 2 numbers
            //(iii) Accurate division between any 2 numbers
   // (iv) Multiplication of any 2 numbers
            //Instantiate your calculator object and invoke all its functions
fun  calculator(num1:Int,num2:Int):Int{
        fun addition(){
            println(addition())
        }
        fun subtraction(){
            println(subtraction())
        }
        fun division(){
            println(division())
        }
        fun multiplication(){
            println(multiplication())
        }
}