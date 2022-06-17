name := "MyTestProject"

version := "0.1"

scalaVersion := "2.13.7"


val gson = "2.2.4"
val scalactic = "3.2.12"
val scalatest = "3.2.12"


lazy val root = (project in file("."))
  .settings(
    libraryDependencies ++= Seq(
      "com.google.code.gson" % "gson" % gson,
      "org.scalatest" %% "scalatest" % scalatest,
      "org.scalatest" %% "scalatest" % scalatest % "test"
    ),
    name := "my-first-project"
  )


