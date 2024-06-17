

object Volume {
  
  def findVolume(rad : Int, pi : Float): Double = {
    
    return (4.0/3.0)* pi *Math.pow(rad,3) ;
  }
  
  def main(args: Array[String]){
    
    var result = findVolume(5, 3.14f);
    println(f"Volume of the sphere : $result%.2f");
  }
}