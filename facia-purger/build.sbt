name := "facia-purger"

version := "1.0"

scalaVersion := "2.11.8"

organization := "com.gu"
description := "Lambda for purging Fastly cache based on s3 events"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-lambda-java-core" % "1.1.0",
  "com.amazonaws" % "aws-lambda-java-events" % "1.3.0",
  "com.squareup.okhttp3" % "okhttp" % "3.2.0",
  "org.parboiled" %% "parboiled" % "2.1.3"
)