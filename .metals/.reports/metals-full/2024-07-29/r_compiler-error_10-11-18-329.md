file:///C:/Users/Sandeepa/Documents/GitHub/scalaPracticals/practical6_1.scala
### java.lang.AssertionError: NoDenotation.owner

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 1055
uri: file:///C:/Users/Sandeepa/Documents/GitHub/scalaPracticals/practical6_1.scala
text:
```scala
object Inventory extends App{
    type productId = Int;
    case class Product(name:String, quantity:Int, price:Double);

    var inventory1: Map[productId, Product] =Map(
        101 -> Product("Table", 10, 100.0),
        102 -> Product("Chair", 20, 50.0),
        103 -> Product("Sofa", 5, 500.0),
        104 -> Product("Bed", 3, 1000.0),
        105 -> Product("Cupboard", 2, 1500.0)
    );
    var inventory2: Map[productId, Product] =Map(
        101 -> Product("Table", 10, 100.0),
        103 -> Product("Sofa", 5, 500.0),
        106 -> Product("Dining Table", 5, 1500.0),
    );

    def retrieveProductNames(inventory: Map[productId, Product]) = inventory.values.map(_.name);
    def claculateValue(inventory: Map[productId, Product]): Double = inventory.values.map(p => p.quantity * p.price).sum;
    def isEmpty(inventory: Map[productId, Product]): Boolean = inventory.isEmpty;
    def mergeInventories(inventory1: Map[productId, Product], inventory2: Map[productId, Product]) ={
        val inventory1QuantityList:Lsit[@@Int) = inventory1.values.map(_.quantity);
        // inventory2Quantity = inventory2.values.map(_.quantity);
    }
    println(retrieveProductNames(inventory1));
    println(claculateValue(inventory1));
    println(isEmpty(inventory1));
    println(mergeInventories(inventory1, inventory2));
}
```



#### Error stacktrace:

```
dotty.tools.dotc.core.SymDenotations$NoDenotation$.owner(SymDenotations.scala:2607)
	scala.meta.internal.pc.SignatureHelpProvider$.isValid(SignatureHelpProvider.scala:83)
	scala.meta.internal.pc.SignatureHelpProvider$.notCurrentApply(SignatureHelpProvider.scala:94)
	scala.meta.internal.pc.SignatureHelpProvider$.$anonfun$1(SignatureHelpProvider.scala:48)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile(LinearSeq.scala:280)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile$(LinearSeq.scala:278)
	scala.collection.immutable.List.dropWhile(List.scala:79)
	scala.meta.internal.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:48)
	scala.meta.internal.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:435)
```
#### Short summary: 

java.lang.AssertionError: NoDenotation.owner