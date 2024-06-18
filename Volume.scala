object Volume {
   def findVolume(r : Int): Double = (4.0/3.0)* Math.PI *Math.pow(r,3) ;
   def main(args: Array[String]){
    var result = findVolume(5);
    println(f"Volume of the sphere : $result%.2f");
  }
}
