class Rational2(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero");



  val numerator: Int = n;
  val denominator: Int = d;


  def sub(that: Rational): Rational = {
    new Rational(
      numerator * that.denominator - denominator * that.numerator,
      denominator * that.denominator
    );
  }

  override def toString: String = s"$numerator/$denominator";
}

object RationalTest2 {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4);
    val y = new Rational(5, 8);
    val z = new Rational(2, 7);

    val result = x.sub(y).sub(z);
    println(s"Result of x - y - z: $result") // Expected output: 13/56
  }
}
