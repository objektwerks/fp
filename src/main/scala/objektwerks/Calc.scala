package objektwerks

@main def calc(args: String*): Unit =
  val expression = args.mkString
  println(expression)
  println(
    Parser.parseAndCalc(expression)
  )