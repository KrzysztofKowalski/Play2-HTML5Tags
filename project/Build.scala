import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "html5Tags"
    val appVersion      = "1.2.0"

    val appDependencies = Seq(
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
      organization := "com.github.krzysztofkowalski"
    )
}
