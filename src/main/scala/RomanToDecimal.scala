object RomanToDecimal {
  def convert(s: String): Int = {
    var result = 0
    var curNum = CharToNumber(s.charAt(0))
    for(i <- 0 until s.length) {
      var nextNum = if(i < s.length - 1) CharToNumber(s.charAt(i + 1)) else 0
      if(curNum < nextNum) {
        result -= curNum
      }
      else {
        result += curNum
      }
      curNum = nextNum
    }
    result
  }

  private def CharToNumber(curChar: Char) = {
    curChar match {
      case 'I' => 1
      case 'V' => 5
      case 'X' => 10
      case 'L' => 50
      case 'C' => 100
      case 'D' => 500
      case 'M' => 1000
      case _ => 0
    }
  }
}
