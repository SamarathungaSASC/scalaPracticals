file:///C:/Users/Sandeepa/Documents/GitHub/scalaPracticals/practical6_2.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Sandeepa/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/Int.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1634
uri: file:///C:/Users/Sandeepa/Documents/GitHub/scalaPracticals/practical6_2.scala
text:
```scala
import  scala.io.StdIn.readLine;
import scala.io.StdIn.readDouble;

object Student extends App{

    def validateInput(student: (String, Array[Double], Double)) ={
        if (student._1.isEmpty()){
            println("Name cannot be empty");
            val isvalidate1 = 0;
        }
        if (student._2.isEmpty){
            println("Marks cannot be empty");
            val isvalidate2 = 0;
        }else if(student._2.foreach(mark => mark < 0)){
            println("Marks should be greater than 0");
            val isvalidate2 = 0;
        }else if(student._3 < 0){
            println("Possible total marks should be greater than 0");
            val isvalidate3 = 0;
        }
        val isvalidate:Array[Int] = Array(isvalidate1, isvalidate2, isvalidate3);
    }

    def printStudentInfo(student: (name: String, marks:Array[Double], percentage:possibleTotalMarks, grade:Char)) ={
        println(s"Name: ${student._1}");
        println(s"Marks: ${student._2}");
    }

    def getStudentInfo() = {
        var marksArray = Array(Double);
        println("Enter student name: ");
        val name:String = readLine();

        println("Enter marks(Enter -1 for stop): ");
        var mark = readDouble();
        while(mark != -1){
            marksArray :+ mark;
            println("Enter marks(Enter -1 for stop): ");
            mark = readDouble();
        }

        println("Total possible marks: ");
        val possibleTotalMarks:Double = readDouble();
        val percentage:Int = (marksArray.sum / possibleTotalMarks) * 100;
        val grade:Char =  percentage m@@>= 90) "A";
                    else if(75 <= percentage < 80) "B";
                    else if(50 <= percentage > 75) "C";
                    else(percentage < 50) "D";
        
        val student =(name, marksArray, percentage, grade);
        //validateInput(student);
        printStudentInfo(student);
    }

    def getStudentInfoWithRetry(isvalidate: Array[Int]) = {

    }

    getStudentInfo();
    
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

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Sandeepa/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/Int.scala