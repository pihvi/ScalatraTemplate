import sbt._
import de.element34.sbteclipsify._

class Build(info: ProjectInfo) extends DefaultWebProject(info) with Eclipsify {
  val scalatra = "org.scalatra" %% "scalatra" % "2.0.0-SNAPSHOT"
  val servletApi = "org.mortbay.jetty" % "servlet-api" % "2.5-20081211" % "provided"
  val jetty6 = "org.mortbay.jetty" % "jetty" % "6.1.24" % "test"
  val jettytester = "org.mortbay.jetty" % "jetty-servlet-tester" % "6.1.24" % "provided"
  val scalatest = "org.scalatest" % "scalatest" % "1.2" % "test"
  
  val sonatypeNexusSnapshots = "Sonatype Nexus Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
}