file:///C:/Users/Sandeepa/Documents/GitHub/scalaPracticals/practical4_1.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Sandeepa/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/Boolean.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1017
uri: file:///C:/Users/Sandeepa/Documents/GitHub/scalaPracticals/practical4_1.scala
text:
```scala
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
                (quantity(index) < numOfQuantity) m@@
                quantity(index) += numOfQuantity;
                println(s"item ${item}, ${numOfQuantity} has been added.");
        }
    }
    def main(args: Array[String]):Unit={
        displayInventory(items,quantity);
        restockItem("Soap", 15);
        //displayInventory(items,quantity);

    }
}
```



#### Error stacktrace:

```
java.base/sun.nio.fs.WindowsPathParser.normalize(WindowsPathParser.java:182)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:153)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:77)
	java.base/sun.nio.fs.WindowsPath.parse(WindowsPath.java:92)
	java.base/sun.nio.fs.WindowsFileSystem.getPath(WindowsFileSystem.java:232)
	java.base/java.nio.file.Path.of(Path.java:147)
	java.base/java.nio.file.Paths.get(Paths.java:69)
	scala.meta.io.AbsolutePath$.apply(AbsolutePath.scala:58)
	scala.meta.internal.metals.MetalsSymbolSearch.$anonfun$definitionSourceToplevels$2(MetalsSymbolSearch.scala:70)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.MetalsSymbolSearch.definitionSourceToplevels(MetalsSymbolSearch.scala:69)
	dotty.tools.pc.completions.CaseKeywordCompletion$.sortSubclasses(MatchCaseCompletions.scala:326)
	dotty.tools.pc.completions.CaseKeywordCompletion$.matchContribute(MatchCaseCompletions.scala:276)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:307)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:109)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:90)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:146)
```
#### Short summary: 

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Sandeepa/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/Boolean.scala