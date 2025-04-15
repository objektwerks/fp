package objektwerks

@main def calc(args: String*): Unit = println( Parser.calc( args.mkString ) )