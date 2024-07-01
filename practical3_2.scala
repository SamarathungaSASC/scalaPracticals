object Filter{
  def filterLongStrings(strings: List[String]):List[String] = {
    strings.filter(_.length > 5);
  }
  
  def main(args: Array[String]):Unit={
    val inputList = List("banana", "orange", "kiwi", "apple");
    val filteredList = filterLongStrings(inputList);
    println(s"Filtered list: $filteredList");
  }
}
