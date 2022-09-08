object RomanToDecimal {
  def convert(s: String): Int = {
    var result = 0
    for(i <- 0 until s.length) {
      var curChar = s.charAt(i)
      if(i == s.length - 1) {
        if (curChar == 'I') {
          result += 1
        }
        if (curChar == 'V') {
          result += 5
        }
      }
      else {
        var nextChar = s.charAt(i + 1)
        var curNum = 0
        if (curChar == 'I') {
          curNum = 1
        }
        if (curChar == 'V') {
          curNum =  5
        }
        var nextNum = 0
        if (nextChar == 'I') {
          nextNum = 1
        }
        if (nextChar == 'V') {
          nextNum = 5
        }
        if(curNum < nextNum) {
          result -= curNum
        }
        else {
          result += curNum
        }
      }
    }
    result
  }
}
