import org.scalatra.ScalatraServlet

class Main extends ScalatraServlet {
  get("/") {
    <h1>Hello</h1>
  }
}