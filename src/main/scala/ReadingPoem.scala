import scala.io.Source

object ReadingPoem extends App {
 val filePath = "src/resources/stopping_by.txt"
  def getLinesFromFile(srcPath: String): Array[String] = {
    val bufferedSource = Source.fromFile(srcPath) //we have a source stream it could be network stream but here it is file stream
    val lines = bufferedSource.getLines().toArray //so we transfer this stream until it ends into lines
    //lines we define the ending character newline or \n
    bufferedSource.close //very important to close a file after reading, do not leave it hanging!
    lines
  }
  val lines = getLinesFromFile(filePath)
  val poemName = lines(0)
  println (s"Poem is called $poemName")
  val secondLineSpilt = lines(1).split(" ")
  val poetName = secondLineSpilt(1)
  val poetLastName = secondLineSpilt(2)
  println(s"Poets name is $poetName  $poetLastName")
  val filteredText = "woods"
  val filteredLines = lines.filter(_.contains(filteredText))
  println(s"Lines containing $filteredText")
  println(filteredLines.mkString("\n"))
}
