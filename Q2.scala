object  Q2 {
  def main(args: Array[String]): Unit = {

    print("Enter number: ");
    var number = scala.io.StdIn.readInt();
    output(number);

  }
  def output(number: Int) =
    number match {

      case number if number <= 0     => println("Negative/Zero is input.")
      case number if number % 2 == 0 => println("Even number is given.")
      case number if number % 2 == 1 => println("Odd number is given.")
    }

}
