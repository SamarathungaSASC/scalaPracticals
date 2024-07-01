object String{
    def reverseString(s: String):String={
        if(s.isEmpty) "";
        else reverseString(s.tail) + s.head;
    }
    def main(args: Array[String]):Unit = {
        val input:String = "Sandeepa";
        val reversedString:String = reverseString(input);
        println(s"Input string- $input");
        println(s"Reversed string- $reversedString");
    }
}