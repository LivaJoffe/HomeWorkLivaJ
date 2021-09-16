package Readingtext


object ExerciseSep16CleanWill extends App {
  val src = "src/resources/The Case of the Missing Will.txt"
  val dst = "src/resources/The Case of the Missing Will_cleaned.txt"
  val lines = Utilities.getLinesFromFile(src)
  val matchText = "THE END"
  val linesNumberWithMatch = lines.zipWithIndex.filter(lineTuple => lineTuple._1.contains(matchText) )
  val endingIndex = linesNumberWithMatch.head._2+1
  val cleanText =lines.slice(0,endingIndex)
  Utilities.saveLines(dst,cleanText)


  //TODO read src
  //TODO write to dst the cleaned version without the Project Gutenberg footer

}
