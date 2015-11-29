// 1. Given a string name, write a match expression that will return the same string if nonempty, 
// or else the string "n/a" if it is empty.
def checkString(input:String) :String ={
  val message = input match {
    case "" => "n/a"
    case _ => input
  }
  return message
}

println(checkString("Hello there"))
println(checkString(""))
println(checkString(null))

// 2. Given a double amount, write an expression to return "greater" if less than zero,
// "same" if it equals zero, and "less" if it is less than zero. Can you do it with 
// if..else blocks? What about match expressions?

def checkVals1(input:Double) :String ={
  if (input > 0) return "greater" else {
    if (input == 0) return "zero" else return "less"
  }
}

def checkVals2(input:Double) :String ={
  val cv2_message = input match {
    case 0 => "zero"
    case s if s > 0 => "greater"
    case s => "less"
  }
  return cv2_message
}

println("\n====checkVals1")
println(checkVals1(10))
println(checkVals1(0))
println(checkVals1(-10))

println("\n====checkVals2")
println(checkVals2(10))
println(checkVals2(0))
println(checkVals2(-10))

// 4. Print 1 to 100, five on each line
for (row <- 0 to 19) {
  for (item <- 1 to 5) {
    print(s"${row*5 + item}, ")
  }
  print("\n")
}

// 5. FizzBuzz, but with TypeSafe instead
for (i <- 1 to 100) {
  if (i % 15 == 0) println("typesafe") else {
    if (i % 3 == 0) println("type") else {
      if (i % 5 == 0) println("safe") else println(s"$i")
    }
  }
}
