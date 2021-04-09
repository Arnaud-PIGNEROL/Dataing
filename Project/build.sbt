name := "Project"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
libraryDependencies += "org.scalatest" % "scalatest_2.13" % "3.1.0" % "test"

// https://mvnrepository.com/artifact/org.apache.kafka/kafka-clients
libraryDependencies += "org.apache.kafka" % "kafka-clients" % "2.7.0"

//libraryDependencies += "org.apache.kafka" %% "kafka-streams-scala" % "2.0.1"
//libraryDependencies += "org.apache.kafka" %% "kafka-streams" % "2.0.1"