import scala.io.StdIn.readLine;

object q1{
    def getProductList():List[String]={
        var products:List[String] = List();
        println("Enter product name");
        var product:String =readLine();
        var count = 1;

        while(product !="done"){
            products = products :+ product;
            println("Enter product name:");
            product = readLine();
            count += 1;
        }
        
        products;
    }
    def printProductList(products: List[String]):Unit={
        if(!products.isEmpty){
            println("Product List");
            for(i <- 0 until products.length){
                println(s"${i + 1}     ${products(i)}");
            }
        }else{
            println("No products");
        }
    }
    def getTotalProducts(products: List[String]):Int ={
        val totProducts = products.length;
        totProducts;
    }
    def main(args: Array[String]):Unit={
        val products = getProductList()
        printProductList(products);
        val totProducts =getTotalProducts(products);
        println(s"Total products: ${totProducts}");
    }
}