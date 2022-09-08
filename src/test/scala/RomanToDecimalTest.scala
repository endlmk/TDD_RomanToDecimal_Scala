import org.scalatest.funsuite.AnyFunSuite

class RomanToDecimalTest extends AnyFunSuite {
  test("Iを渡すと1を返す") {
    assert(1 == RomanToDecimal.convert("I"))
  }
  test("IIを渡すと2を返す") {
    assert(2 == RomanToDecimal.convert("II"))
  }
  test("Vを渡すと5を返す") {
    assert(5 == RomanToDecimal.convert("V"))
  }
}
