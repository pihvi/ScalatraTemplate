import sbt._
import de.element34.sbteclipsify._

class Build(info: ProjectInfo) extends DefaultProject(info) with Eclipsify {}