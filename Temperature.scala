

object Temperature {
  
  def findTempInFahrenheit(c : Int): Double = {
    
    return c*1.8000 + 32.00;
  }
  
  def main(args: Array[String]){
    
    var result = findTempInFahrenheit(35);
    println("Temperature in Fahrenheit : " + result + "°C");
  }
}