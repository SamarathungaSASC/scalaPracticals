object Pattern{
    def checkType(x:Int):Unit={
        (x % 2 == 0) match{
            case true => println("Even");
            case false => println("Odd");
        }
    }
    def patternMatch(x:Int):Unit={
        x <= 0 match{
            case true => println("Zero/Negetive");
            case false => checkType(x);
        }
    }
    def main(args: Array[String]):Unit={
        println("Enter value:");
        val x =scala.io.StdIn.readInt();
        patternMatch(x);
    }
}