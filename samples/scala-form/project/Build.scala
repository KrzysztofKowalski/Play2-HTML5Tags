import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "scala-form"
  val appVersion      = "1.0"

  val appDependencies = Seq(
  	  "com.loicdescotte.coffeebean" % "html5tags_2.10" % "1.1.0"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
  )

}
