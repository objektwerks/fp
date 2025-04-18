package objektwerks

@main def calc(args: String*): Unit =
  val expression = args.mkString.replace(" ", "")
  val result = Parser.parseAndCalc(expression)
  println(s"Expression: $expression")
  println(s"Result: $result")