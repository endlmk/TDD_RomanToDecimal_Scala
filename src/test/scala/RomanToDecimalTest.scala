import org.scalatest.funsuite.AnyFunSuite

class RomanToDecimalTest extends AnyFunSuite {
  test("Iを渡すと1を返す") {
    assert(RomanToDecimal.convert("I") == 1)
  }
  test("IIを渡すと2を返す") {
    assert(RomanToDecimal.convert("II") == 2)
  }
  test("Vを渡すと5を返す") {
    assert(RomanToDecimal.convert("V") == 5)
  }
  test("IVを渡すと4を返す") {
    assert(RomanToDecimal.convert("IV") == 4)
  }
  test("VIを渡すと6を返す") {
    assert(RomanToDecimal.convert("VI") == 6)
  }
}
