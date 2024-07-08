import scala.io.StdIn.readLine;
object Q3{
    def toUpper (name: String):String={
        name.toUpperCase();
    }
    def toLower (name: String):String={
        name.toLowerCase();
    }
    def formatNames(name:String)(format: String => String):String ={
        format(name);
    }
    def main(ars: Array[String]):Unit={
        val names =("Benny", "Niroshan", "Saman", "Kumara");
        
        println(formatNames(names(0))(toUpper));
        
        println(formatNames(names(1)) { name =>
            name.substring(0,2).toUpperCase + name.substring(2).toLowerCase
        })

        println(formatNames(names(2))(toLower));

        println(formatNames(names(3)) { name =>
            name.substring(0,1).toUpperCase + name.substring(1,(name.length - 1)).toLowerCase+name.last.toUpper;
        })
    }
}