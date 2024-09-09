class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero");

  val numerator: Int = n;
  val denominator: Int = d; 

  def neg: Rational = new Rational(-numerator, denominator);

  override def toString: String = s"$numerator/$denominator";
}

object RationalTest {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 9);
    println(s"x: $x");
    println(s"x.neg: ${x.neg}"); 
  }
}
