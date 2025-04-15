package objektwerks

@main def calc(args: String*): Unit =
  val expression = args.mkString
  println(s"Expression: $expression")
  println(
    s"Result: ${Parser.parseAndCalc(expression)}"
  )