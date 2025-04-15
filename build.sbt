import scalanative.build.Mode

enablePlugins(ScalaNativePlugin)

name := "calc"
organization := "objektwerks"
version := "0.2-SNAPSHOT"
scalaVersion := "3.7.0-RC2"
libraryDependencies ++= {
  Seq(
    "com.lihaoyi" %%% "fastparse" % "3.1.1",
    "org.scalatest" %%% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
nativeConfig ~= {
  _.withMode(Mode.releaseFast)
}