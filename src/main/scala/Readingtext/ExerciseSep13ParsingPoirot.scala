package Readingtext

object ExerciseSep13ParsingPoirot extends App {

  val srcFolder = "src/resources"
  val regex = "^[0-9].*"
  val files = Utilities.getListOfFiles(srcFolder, regex)
  println(files.head) //we could potentially have nothing here
  println(files.head.getPath) //this will give us the path as a string
  val filePath = files.head.getPath
  val lines = Utilities.getLinesFromFile(filePath)
  println(s"We have ${lines.length} lines in $filePath")
  val filterText = "Poirot"
  val filteredLines = for (line <- lines if line.contains(filterText)) yield line
  println(s"Lines containing $filterText")
  println(filteredLines.mkString("\n"))
  println("")
  println(s"There are ${filteredLines.length} lines that mention $filterText")
  println("")
  println(filteredLines(0))
  println(filteredLines(1))
  println(filteredLines(2))
  println(filteredLines(3))
  println(filteredLines(4))

  val dstPath = "src/resources/tableOfContents.txt"
  val regexAlso = "/[a-z]+/g"
  val chapterLines = for (line <- lines if line.startsWith("CHAPTER")) yield line
  println(chapterLines.mkString("\n"))
  Utilities.saveLines(dstPath, chapterLines)
}