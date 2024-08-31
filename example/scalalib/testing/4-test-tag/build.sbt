ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "mymillproject",
    // mainClass := Some("myapp"), // 如果需要主类,取消此行注释
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )