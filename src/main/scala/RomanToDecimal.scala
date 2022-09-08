object RomanToDecimal {
  def convert(s: String): Int = {
    var result = 0
    for(c <- s) {
      if(c == 'I') {
        result += 1
      }
      if (c == 'V') {
        result += 5
      }
    }
    result
  }
}
