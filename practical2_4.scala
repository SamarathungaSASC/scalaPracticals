object theater{
    def profit(price:Int):Int = income(price) - cost(price);
    def cost(price:Int):Int = 500 + attendees(price);
    def income(price:Int):Int =attendees(price) * price;
    def attendees(price:Int):Int =120 + (15-price) / 5 *20;
    
    def main(arg: Array[String])={
        println(profit(30));
    }
}