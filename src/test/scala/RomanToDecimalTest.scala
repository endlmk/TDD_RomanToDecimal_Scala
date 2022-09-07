import org.scalatest.funsuite.AnyFunSuite

class RomanToDecimalTest extends AnyFunSuite {
  test("Iを渡すと1を返す") {
    assert(1 == RomanToDecimal.convert("I"))
  }
}
