object Area {
  def calculateArea(r:Double):Double = Math.PI*r*r  
  def main(args: Array[String])={
    var result = calculateArea(5);
    println(f"Area :$result%.2f");
  }
}
