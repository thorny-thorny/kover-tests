import kotlin.test.Test
import kotlin.test.expect

class KotlinGreetersTests {
  @Test
  fun testKotlinGreeters() {
    expect(Unit) {
      Greeter("Thorny")
      GreeterWithOptional()
      GreeterWithOptional("Thorny")
      GreeterWithOptional(name = "Thorny")
      return
    }
  }
}
