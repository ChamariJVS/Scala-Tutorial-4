object Q3 {

  def main(args: Array[String]): Unit = {

    formatNames("Benny", toUpper(_));
    formatNames("Niroshan", toLower(_))
    formatNames("Saman", toLower(_))
    formatNames("Kumara", toUpper(_))

  }

  def toUpper(name: String): Unit = {
    println(name.toUpperCase());
  }

  def toLower(name: String): Unit = {
    println(name.toLowerCase());
  }

  def formatNames(name: String, function: String => Unit): Unit = {
    function(name)
  }

}
