ThisBuild / scalaVersion := "3.0.0-RC3"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "scalajs nodejs example",
    scalaJSUseMainModuleInitializer := true,
    //scalaJSModuleKind := ModuleKind.CommonJSModule
    // ECMAScript
    //scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) }
    // CommonJS
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.CommonJSModule)
    },
    libraryDependencies ++= Seq(
      ("org.scala-js" %%% "scalajs-dom" % "1.1.0").cross(CrossVersion.for3Use2_13)
      //,
      //"io.scalajs" %%% "nodejs" % "0.5.0"
    )
  )
