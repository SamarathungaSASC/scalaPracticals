object expressionTwo{
    var a:Int = 2;
    var b:Int = 3;
    var c:Int = 4;
    var d:Int = 5;
    var K:Float =4.3f;

    def main(arg: Array[String])={
        println((-b) * a + c * d);
        println(a);
        a +=1;
        //println(-2*(g - k) + c);      error g is not dfine
        println({
            val cNew = c;
            c+=1;
            cNew
        })
        println({
            c+=1;
            val result = c *a;
            a +=1;
            c = result;
            result;
        })
    }
}


