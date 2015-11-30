//Expressions cover both literal values ("hello") and calculate values ("hel" + 'l' +"o")
if (47 % 3 > 0) println("Not a multiple of 3")

val x = 10
val y = 20
if (x > y) println(x) else println(y)

//Match Expressions
val max = x > y match {
  case true => println("x")
  case false => println("y")
}

val status = 500
val response = status match {
  case 200 => println("Status ok")
  case 400 => {
    println("ERROR - we called the service incorrectly")
    "error"
  }
  case 500 => {
    println("ERROR - the service is unavailable")
    "error"
  }
}

// Value binding and pattern alternatives

val day = "FAKEDAY"
val kind = day match {
  case "MON" | "TUE" | "WED"| "THURS" | "FRI" => println("weekday")
  case "SAT" | "SUN" => println("weekend")
  case other => println(s"Invalid input - can't parse ${day}") // can also use _ instead as a wildcard
}

//Matching with pattern guards
val input: String = null
input match {
  case s if s != null => println(s"Received '$s'")
  case s => println("Error, received null response")
}

// Loops
for (i <- 1 to 7) {println(s"Hello $i")}

// or, instead of doing something in the block itself, you can return a collection of things
// just use the yield keyword
val arrDays = for (i <- 1 to 7) yield { s"Day $i " }
for (day <- arrDays) print(day)

// Iterator Guards
val threes = for (i <- 1 to 20 if i % 3 == 0) yield { i }
for (num <- threes) println(num)

for {
    t <- "Faith, Hope,,Charity".split(",")
    if t != null
    if t.size > 0
  }
  {
    println(t)
  }