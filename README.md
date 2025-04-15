Fastparse
---------
>Fastparse feature tests using Scala 3.

Install
-------
>See: http://www.scala-native.org/en/latest/user/setup.html
1. brew install llvm

Build
-----
1. ```sbt clean compile```

Test
----
1. ```sbt clean test```

Publish
-------
1. ```sbt clean test nativeLink```
2. ```mv target/scala-3.7.0-RC2/todo-native-cli target/scala-3.7.0-RC2/todo```
3. ```sudo cp target/scala-3.7.0-RC1/todo /usr/local/bin```

Execute
-------
1. todo 1 + 2

Resources
---------
* [Scala Native Docs](http://www.scala-native.org/en/latest/index.html)
* [Scala Native Intro Video](https://www.youtube.com/watch?v=u2CnE-sRdBw)
* [Fastparse Docs](https://com-lihaoyi.github.io/fastparse/)
* [Fastparse Github](https://github.com/com-lihaoyi/fastparse)