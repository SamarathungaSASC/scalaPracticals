object Time {
  def easyTime(x: Int):Int = x*8;
  def tempoTime(y: Int):Int = y*7;
  def totalTime(d1: Int, d2: Int, d3: Int):Int = easyTime(d1) + tempoTime(d2) + easyTime(d3);
  def main(args: Array[String]){
    var result = totalTime(2, 3, 2);
    println("Total time : " + result + " miniutes");
  }
}
