object XYZ{
    def calTakehomeSalary(x:Int, y:Int):Int= salary(x,y) - calTax(x,y);
    def salary(x:Int, y:Int):Int = basicSalary(x) + calOT(y);
    def calTax(x:Int, y:Int):Int = (salary(x,y) *0.12).toInt;
    def calOT(y:Int):Int = y*85;
    def basicSalary(x:Int):Int = x*250;
    def main(args: Array[String])={
        var salary = calTakehomeSalary(40, 30);
        println(s"Take Home Salary(week):  $salary");
    }
}