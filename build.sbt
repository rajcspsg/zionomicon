ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

val zioVersion = "2.0.2"
val commonSettings = Seq(
  libraryDependencies ++= Seq(
    "dev.zio" %% "zio" % zioVersion,
    "dev.zio" %% "zio-test" % zioVersion,
    "dev.zio" %% "zio-test-sbt" % zioVersion

  )
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
    name := "c2_testing",
    commonSettings
  )

val c04_zio_error_model = (project in file("c04-zio-error-model"))
  .settings(
    name := "c04_zio_error_model",
    commonSettings
  )
