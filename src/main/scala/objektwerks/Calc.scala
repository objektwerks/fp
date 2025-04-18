package objektwerks

@main def calc(args: String*): Unit =
  val expression = args.mkString
  val result = Parser.parseAndCalc(expression)
  println(s"Result: $result")