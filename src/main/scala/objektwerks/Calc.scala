package objektwerks

@main def calc(args: String*): Unit =
  println(
    Parser.parseAndCalc( args.mkString )
  )