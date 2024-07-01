object Sum{
    def calSumOfEven(numbers: List[Int]):Int={
        numbers.filter(_ % 2 == 0).sum;
    }
    def main(args: Array[String]):Unit={
        val input = List(1, 2, 3, 4, 5);
        val sumOfEven = calSumOfEven(input);
        println(s"Sum of even numbers: $sumOfEven");
    }
}