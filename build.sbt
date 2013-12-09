name := "hello"

version := "1.0"

scalaVersion := "2.10.3"

sbtVersion := "0.13.0"

scalacOptions ++= Seq("-feature")

libraryDependencies ++= Seq(
    "junit" % "junit" % "4.11" % "test",
    "org.scalatest" % "scalatest_2.10" % "2.0" % "test"
)


