object   Q1 {
  def main(args: Array[String]): Unit = {

    print("Enter The deposit amount : ");
    var diposit_Amount = scala.io.StdIn.readDouble();
    print("The interest amount :" + interest(diposit_Amount));

  }
  def interest(diposit_Amount: Double): Double =
    diposit_Amount match {

      case diposit_Amount if diposit_Amount <= 20000   => diposit_Amount * 0.02;
      case diposit_Amount if diposit_Amount <= 200000  => diposit_Amount * 0.04;
      case diposit_Amount if diposit_Amount <= 2000000 => diposit_Amount * 0.035;
      case diposit_Amount if diposit_Amount > 2000000  => diposit_Amount * 0.065;
    }
}
