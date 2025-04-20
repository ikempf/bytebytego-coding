lazy val root = project
  .in(file("."))
  .settings(
    name := "bytebytego-coding",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "3.6.4"
  )
  .settings(
    libraryDependencies += "org.typelevel" %% "cats-core" % "2.13.0",
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
  )
