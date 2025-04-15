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
1. ```sbt clean compile nativeLink```
2. ```mv target/scala-3.7.0-RC2/todo-native-cli target/scala-3.7.0-RC2/todo```
3. ```sudo cp target/scala-3.7.0-RC1/todo /usr/local/bin```

Resources
---------
* [Fastparse Docs](https://com-lihaoyi.github.io/fastparse/)
* [Fastparse Github](https://github.com/com-lihaoyi/fastparse)