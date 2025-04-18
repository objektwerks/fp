package objektwerks

@main def calc(args: String*): Unit = Parser.parseAndCalc( args.mkString )