import scala.xml._
import org.scalatra.test._
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class MainTest extends FunSuite with ShouldMatchers with ScalatraTests {
  route(classOf[Main], "/*")

  test("simple get") {
    get("/") {
      status should equal (200)
      XML.loadString(body) should be (<h1>Hello</h1>)
    }
  }
}