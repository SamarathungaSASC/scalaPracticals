object retailStore{
    var items = Array("Soap", "Toothpaste","Biscuit","Toffee","Brush");
    var quantity = Array(15,10,50,200,5);

    def displayInventory (items: Array[String],quantity: Array[Int]):Unit={
        if(items.length > 0 && quantity.length > 0){
            println(items.head);
            println(quantity.head);
            displayInventory(items.tail, quantity.tail);
        }
    }

    def restockItem(item:String, numOfQuantity:Int):Unit={
        val index:Int = items.indexOf(item);
        index match{
            case -1 => println("Item does not exist");
            case _ => quantity(index) += numOfQuantity;
                      println(s"item ${item}, ${numOfQuantity} has been added.");
        }
    }
    def sellItem(item:String, numOfQuantity:Int):Unit={
        val index:Int = items.indexOf(item);
        index match{
            case -1 => println("Item does not exist");
            case _ => 
                (quantity(index) < numOfQuantity) match{
                    case true => println("Does not have enough quantity");
                    case false => quantity(index) -= numOfQuantity;
                                    println(s"Item ${item},  ${numOfQuantity} has been sold.");
                }
        }
    }
    def main(args: Array[String]):Unit={
        displayInventory(items,quantity);
        restockItem("Soap", 15);
        //displayInventory(items,quantity);
        sellItem("Brush", 2);
        //displayInventory(items,quantity);
    }
}