
println("\n\n****** Special characters *********")
val signature = "With Regards, \nYour friend \nJessie"
println(signature)

println("\n\n****** String interpolation! *********")
val item = "apple"
println(s"How do you like them ${item}s?")
println(s"So many ${item *3}")

println("\n\n****** RegExs (ewwwww) *********")
val input = "Enjoying this apple 3.1459 times today"
val pattern = """.* apple ([\d.]+) times .*""".r
val pattern(amountText) = input

println(s"AmountText = ${amountText}")

println("\n\n****** Fun with Tuples *********")
val info = (5, "Korean", true)

println("info = (5, \"Korean\", true)" )
println(s"1: ${info._1}")
println(s"2: ${info._2}")
println(s"3: ${info._3}")


println("\n\n****** Exercises *********")
println("Exercise 1")
println(convertToF(20))

println("Exercise 2")
println(convertToC(75))

println("Exercise 3")
val ex3 = 2.7255
val ex3a = f"${ex3}%.2f"
val strEx3 = "You owe $" + ex3a
println(strEx3)

def convertToF(temp:Int) :Int ={
  val result1 = temp * 9 / 5
  val result2 = result1 + 32
  return result2
}

def convertToC(temp:Int) :Int ={
  val result1 = temp - 32 
  val result2 = result1 * 5 / 9
  return result2
}