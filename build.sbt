ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

val commonSettings = Seq(
  libraryDependencies += "dev.zio" %% "zio" % "2.0.2"
)

lazy val root = (project in file("."))
  .settings(
    name := "zionomicon",
    commonSettings
  )

val c1_first_steps = (project in file("c1-first-steps"))
  .settings(
    name:= "c1_first_steps",
    commonSettings
  )

val c2_testing = (project in file("c2-testing"))
  .settings(
    name := "c2_testing"
  )
