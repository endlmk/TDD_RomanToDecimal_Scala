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
  test("Xを渡すと10を返す") {
    assert(RomanToDecimal.convert("X") == 10)
  }
  test("Lを渡すと50を返す") {
    assert(RomanToDecimal.convert("L") == 50)
  }
  test("Cを渡すと100を返す") {
    assert(RomanToDecimal.convert("C") == 100)
  }
  test("Dを渡すと500を返す") {
    assert(RomanToDecimal.convert("D") == 500)
  }
  test("Mを渡すと1000を返す") {
    assert(RomanToDecimal.convert("M") == 1000)
  }
  test("MCMIVを渡すと1904を返す") {
    assert(RomanToDecimal.convert("MCMIV") == 1904)
  }
  test("DXXIを渡すと521を返す") {
    assert(RomanToDecimal.convert("DXXI") == 521)
  }
  test("MMMCMXCIXを渡すと3999を返す") {
    assert(RomanToDecimal.convert("MMMCMXCIX") == 3999)
  }
}
