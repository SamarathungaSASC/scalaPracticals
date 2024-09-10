object Count{
    def countLetterOccurrences(list: List[String]):Int = {
        list.map((word)=>word.length).reduce((a,b)=>a+b);

    }
    def main(args: Array[String]): Unit = {
        val list = List("apple", "banana", "cherry", "date");
        println(" Total count of letter occurrences : "+countLetterOccurrences(list));

    }
}