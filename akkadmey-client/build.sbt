name := """akkadmey-client"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

javaOptions ++= Seq("-Xmx512M", "-Xms256M", "-XX:MaxPermSize=512M")

libraryDependencies ++= Seq(
  "com.harmeetsingh13.akkalearning"  %% "akkadmey-db" % "0.0.1-SNAPSHOT"
)
// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

