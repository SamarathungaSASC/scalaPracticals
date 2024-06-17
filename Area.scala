

object Area {
  
  def findArea(radius:Int,pi:Float):Float = {
    
    return pi*radius*radius;
  }
  
  def main(args: Array[String]){
    
    var result = findArea(5, 3.14f);
    println("Area : " + result);
  }
}