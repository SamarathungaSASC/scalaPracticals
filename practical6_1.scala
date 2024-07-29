object Inventory extends App{
    type productId = Int;
    case class Product(name:String, quantity:Int, price:Double);

    val inventory1: Map[productId, Product] =Map(
        101 -> Product("Table", 10, 100.0),
        102 -> Product("Chair", 20, 50.0),
        103 -> Product("Sofa", 5, 500.0),
        104 -> Product("Bed", 3, 1000.0),
        105 -> Product("Cupboard", 2, 1500.0)
    );
    val inventory2: Map[productId, Product] =Map(
        101 -> Product("Table", 20, 50.0),
        103 -> Product("Sofa", 10, 500.0),
        106 -> Product("Dining Table", 5, 1500.0)
    );

    def retrieveProductNames(inventory: Map[productId, Product]) = inventory.values.map(_.name);

    def claculateValue(inventory: Map[productId, Product]): Double = inventory.values.map(p => p.quantity * p.price).sum;

    def isEmpty(inventory: Map[productId, Product]): Boolean = inventory.isEmpty;

    def mergeInventories(inventory1: Map[productId, Product], inventory2: Map[productId, Product]): Map[productId, Product] ={
        
        var mergedInventory:Seq[(Inventory.productId, Inventory.Product)] = inventory1.toSeq ++ inventory2.toSeq;
        // println(mergedInventory);
        
        mergedInventory.groupBy(_._1).map{
            case (id, products) =>
                val mergedProduct = products.map(_._2).reduce{
                    (p1, p2) => 
                        Product(p1.name, p1.quantity + p2.quantity, p1.price)
                }
                id -> mergedProduct;
        }
    }
    def checkProductById(inventory: Map[productId, Product], id: Int): Option[Product] = {
        inventory.get(id) match {
            case Some(product) => Some(product);
            case None => None;
        }
    }

    println(retrieveProductNames(inventory1));
    println(claculateValue(inventory1));
    println(isEmpty(inventory1));
    mergeInventories(inventory1, inventory2).foreach(println);
    println(checkProductById(inventory1, 100));
}