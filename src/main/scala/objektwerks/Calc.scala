package objektwerks

@main def calc(args: String*): Unit =
  val expression = args.mkString.replace(" ", "")
  println(s"Expression: $expression")
  
  val result = Parser.parseAndCalc(expression)
  println(s"Result: $result")