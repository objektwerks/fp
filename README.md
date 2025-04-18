Calc
----
>Scala native calc app using FastParse and Scala 3.

>The code herein is ***derived*** from the FastParse docs.

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

Run
---
1. sbt "run 1+1"

Publish
-------
1. ```sbt clean test nativeLink```
2. ```mv target/scala-3.7.0-RC2/calc target/scala-3.7.0-RC3/calc```
3. ```sudo cp target/scala-3.7.0-RC3/calc /usr/local/bin```

Execute
-------
>**All** calc app expressions **must**:
1. contain zero spaces; and
2. be enclosed in double quotes!
>For instance, ```calc "1+1"``` yields:
```
➜  calc git:(main) calc "1+1"                                                
Expression: 1+1
Result: 2
```
>**TODO**: Remove the above requirements 1 and 2!

Resources
---------
* [Scala Native Docs](http://www.scala-native.org/en/latest/index.html)
* [Scala Native Intro Video](https://www.youtube.com/watch?v=u2CnE-sRdBw)
* [FastParse Docs](https://com-lihaoyi.github.io/fastparse/)
* [FastParse Github](https://github.com/com-lihaoyi/fastparse)