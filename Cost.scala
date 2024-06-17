

object Cost {
  
  def findCost(bookNum : Int, coverPrice: Double): Double = {
    
    if (bookNum > 50){
      return (coverPrice*bookNum)+(3*50)+(0.75*(bookNum-50));
    }
    else{
      return (coverPrice*bookNum)+(3*bookNum);
    }
  }
  
  def main(args: Array[String]){
    
    var coverPrice = 24.95 * (40.0/100.0);
    var bookNum = 60;
    var result = findCost(bookNum, coverPrice);
    println(f"Total cost : $result%.2f Rs");
  }
}