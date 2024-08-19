import scala.io.StdIn._

object practical9 extends App{
    def interest(deposit: Double): Double ={
        deposit match{
            case deposit if deposit <= 20000 => deposit * 0.02
            case deposit if deposit >= 200000 => deposit * 0.04
            case deposit if deposit <= 2000000 => deposit * 0.035
            case _ => deposit * 0.065
        }
    }
    println(interest(10000));

    def patternMatch():Unit ={
        println("Enter a number: ");
        val x =readInt();
        x match{
            case x if x <=0 => println("Negative/Zero");
            case x if x % 2 == 0 => println("Even");
            case _ => println("Odd");
        }
    }
    patternMatch();

    def toUpper(s: String): String = {
        s.toUpperCase()
    }
    
    def toLower(s: String): String = {
        s.toLowerCase()
    }
    
    def formatNames(name: String, f: String => String): String = {
        f(name)
    }
    
    println(formatNames("Benny", toUpper));
    println(formatNames("Niroshan", name => name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase));
    println(formatNames("Saman", toLower));
    println(formatNames("Kumara", name => name.substring(0, 1).toUpperCase + name.substring(1, name.length - 1).toLowerCase + name.last.toUpper)) 
}