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
1. sbt "run 1 + 2"

Publish
-------
1. ```sbt clean test nativeLink```
2. ```mv target/scala-3.7.0-RC4/calc target/scala-3.7.0-RC4/calc```
3. ```sudo cp target/scala-3.7.0-RC4/calc /usr/local/bin```

Execute
-------
>Enclose all expressions in double quotes("1 + 1"):
1. calc "1 + 1"
```
➜  calc git:(main) calc "1 + 1"
Raw Expression: 1 + 1
Compressed Expression: 1+1
Result: 2
```
>Some expressions will work without double quotes, and some won't.
>Clearly, certain math symbols are handled differently on the command line.

Examples
--------
```
➜  calc git:(main) calc "1 + 1"
Raw Expression: 1 + 1
Compressed Expression: 1+1
Result: 2
➜  calc git:(main) calc "2 - 1"
Raw Expression: 2 - 1
Compressed Expression: 2-1
Result: 1
➜  calc git:(main) calc "2 * 2"
Raw Expression: 2 * 2
Compressed Expression: 2*2
Result: 4
➜  calc git:(main) calc "4 / 2"
Raw Expression: 4 / 2
Compressed Expression: 4/2
Result: 2
➜  calc git:(main) calc "(1 + 1 * 2) + 3 * 4"
Raw Expression: (1 + 1 * 2) + 3 * 4
Compressed Expression: (1+1*2)+3*4
Result: 15
➜  calc git:(main) calc "((1 + 1 * 2) + (3 * 4 * 5)) / 3"
Raw Expression: ((1 + 1 * 2) + (3 * 4 * 5)) / 3
Compressed Expression: ((1+1*2)+(3*4*5))/3
Result: 21
```

Resources
---------
* [Scala Native Docs](http://www.scala-native.org/en/latest/index.html)
* [Scala Native Intro Video](https://www.youtube.com/watch?v=u2CnE-sRdBw)
* [FastParse Docs](https://com-lihaoyi.github.io/fastparse/)
* [FastParse Github](https://github.com/com-lihaoyi/fastparse)
