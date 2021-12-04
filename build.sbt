name := "Assignment-UT-IT"

version := "0.1"

scalaVersion := "2.13.7"

lazy val Module1 = project.in(file("Module1"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % "test",
      "org.mockito" %% "mockito-scala" % "1.16.46" % "test"
    ))

lazy val Module2 = project.in(file("Module2"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % "test",
      "org.mockito" %% "mockito-scala" % "1.16.46" % "test"
    ))
lazy val root = project.in(file(".")).aggregate(Module1, Module2)