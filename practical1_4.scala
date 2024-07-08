object Cost {
  def bookCost(bookNum: Int):Double = bookNum *24.95;
  def discount(price: Double):Double = price * 40/ 100;
  def discountPrice(bookNum: Int): Double = {
    val price = bookCost(bookNum)
    price - discount(price)
  }
  def shipping(bookNum: Int):Double = {
    if(bookNum <= 50)
      3*50
    else
      3*50 + (bookNum - 50) * 0.75
  }
  def totalCost(bookNum: Int):Double = discountPrice(bookNum) + shipping(bookNum);
  def main(args: Array[String])={
    var result = totalCost(60);
    println(f"Total cost : $result%.2f Rs");
  }
}
