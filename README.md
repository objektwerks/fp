Calc
----
>Scala native calc app using FastParse and Scala 3.

Install
-------
>See: http://www.scala-native.org/en/latest/user/setup.html
1. ```brew install llvm```

Build
-----
1. ```sbt clean compile```

Test
----
1. ```sbt clean test```

Publish
-------
1. ```sbt clean test nativeLink```
2. ```mv target/scala-3.7.0-RC2/calc target/scala-3.7.0-RC2/calc```
3. ```sudo cp target/scala-3.7.0-RC2/calc /usr/local/bin```

Execute
-------
1. calc 1 + 2

Resources
---------
* [Scala Native Docs](http://www.scala-native.org/en/latest/index.html)
* [Scala Native Intro Video](https://www.youtube.com/watch?v=u2CnE-sRdBw)
* [FastParse Docs](https://com-lihaoyi.github.io/fastparse/)
* [FastParse Github](https://github.com/com-lihaoyi/fastparse)