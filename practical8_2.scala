import scala.io.StdIn._

object practical8_2 extends App{
    printf("Enter a number: ");
    val x:Int =readInt();   
    val isMultipleOf3  = (x: Int) => x % 3 == 0;
    val isMultipleOf5  = (x: Int) => x % 5 == 0;

    def checkNumber(x:Int):String ={
        val result:String  = x match  {
            case x if isMultipleOf3(x) && isMultipleOf5(x) => "Multiple of Both Three and Five";
            case x if isMultipleOf3(x) => "Multiple of Three";
            case x if isMultipleOf5(x) => "Multiple of Five";
            case _ => "Not a Multiple of Three or Five"
        }
        result;
    };
    println(checkNumber(x));
}