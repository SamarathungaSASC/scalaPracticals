

object Time {
  
  def findTime(distance : Int): Int = {
    
    var time = 0;
    
    for(i <- 1 to distance){
      if(i <=2){
        time += 8;
      }else if(i > 2 && i <= 5)
      {
        time += 7;
      }else if(i > 5 && i <= 7)
      {
        time += 8;
      }
    }
    return time;
  }
  
  def main(args: Array[String]){
    
    var result = findTime(7);
    println("Tptal time : " + result + "miniutes");
  }
}