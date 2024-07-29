import scala.io.StdIn._

object StudentApp extends App {

  def validateInput(name: String, marksArray: Array[Int], totalMarks: Int): (Boolean, Option[String]) = {
    var isValid = true;
    var errorMessage: Option[String] = None

    if(name.isEmpty){
        isValid = false;
        errorMessage = Some("Name cannot be empty");
    }else if (marksArray.exists(mark => mark < 0) || marksArray.exists(mark => mark > 100)) {
      isValid = false
      errorMessage = Some("Marks should be between 0 and 100")
    }else if (totalMarks <= 0) {
      isValid = false
      errorMessage = Some("Total marks should be greater than 0")
    }else{
        (isValid, errorMessage);
    }
    if(!isValid){
        getStudentInfoWithRetry(isValid, errorMessage);
    }
    (isValid, errorMessage);

  }

  def printStudentRecord(student: (String, Array[Int], Int, Double, Char)): Unit = {
    println(s"Name: ${student._1}")
    println(s"Marks: ${student._2.mkString(", ")}")
    println(s"Total Marks: ${student._3}")
    println(s"Percentage: ${student._4}%")
    println(s"Grade: ${student._5}")
  }

  def getStudentInfo(): (String, Array[Int], Int, Double, Char) = {
    println("Enter student name: ")
    val name: String = readLine()


    println("Enter number of subjects: ");
    val numSubjects: Int = readInt();
    var marksArray:Array[Int] = new Array[Int](numSubjects);
    for(i <- 1 to numSubjects){
        println(s"Enter marks for subject ${i}: ");
        val marks: Int = readInt();
        marksArray(i-1) = marks;
    }

    println("Enter total possible marks: ")
    val totalPossibleMarks: Int = readInt()

    val percentage: Double = (marksArray.sum.toDouble / totalPossibleMarks) * 100
    val grade: Char = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }
    validateInput(name, marksArray, totalPossibleMarks);
    var totalMarks = marksArray.sum;
    (name, marksArray, totalMarks, percentage, grade)
    }

    def getStudentInfoWithRetry(isValid:Boolean, errorMessage:Option[String]) = {
        if(!isValid){
            println(errorMessage);
            getStudentInfo();
        }
    }

  // Main
  val studentRecord = getStudentInfo();
  printStudentRecord(studentRecord);
}
