object Practical7 extends App{
    val list1: List[Int] = List(1,2,3,4,5,6,7,8,9,10);
    
    def filterEvenNumbers(list: List[Int]): List[Int] = {
        list.filter(_ % 2 == 0);
    };

    val list2: List[Int] = List(1,2,3,4,5);
    def calculateSquare(list: List[Int]): List[Int] ={
        //list.map(_ * _);  
        list.map(x => x*x);  
    };

    val list3: List[Int] = List(1,2,3,4,5,6,7,8,9,10);
    def filterPrime(list: List[Int]): List[Int] = {;
        list.filter(isPrime);
    };
    def isPrime(n : Int): Boolean = {
        if(n <=1) false;
        else if(n ==2) true;
        else !(2 to (n-1)).exists(x => n % x == 0);
    };
    println(filterEvenNumbers(list1));
    println(calculateSquare(list2));
    println(filterPrime(list3));
}