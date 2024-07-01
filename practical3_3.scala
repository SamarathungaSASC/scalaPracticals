object Average{
    def calAverage(num1: Int, num2: Int):Double={
        val average:Double = (num1 + num2) / 2;
        BigDecimal(average).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble;
    }

    def main(args: Array[String]):Unit ={
        val average:Double = calAverage(5, 8);
        println(s"Average-: $average");
    }
}