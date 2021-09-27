package Readingtext
import Readingtext.CookBook.lines
object CookBookExercise extends App {

  val src = "src/resources/cook_book.txt"
  val dst = "src/resources/cookBookCleaned.txt"
  val lines = Utilities.getLinesFromFile(src)

  val matchTextStart = "Recipes Specially Prepared _by_ Miss Elizabeth Kevill Burr"
  val recipeLinesStart= lines.zipWithIndex.filter(lineTuple => lineTuple._1.contains(matchTextStart) )
  println(recipeLinesStart.head)
  val startingIndex = recipeLinesStart.head._2

  val matchTextEnd = "WALTER BAKER & CO., Ltd."
  val recipeLinesEnd= lines.zipWithIndex.filter(lineTuple => lineTuple._1.contains(matchTextEnd) )
  println(recipeLinesEnd.head)
  val endingIndex = recipeLinesEnd.head._2

  val recipeLines = lines.slice(startingIndex, endingIndex+1)

  val ingredients = recipeLines.filter(_.startsWith("    "))
  val rgxForAllCapsLines = "^[A-Z]*\\s.*".r
  val recipeTitles =recipeLines.filter(line => rgxForAllCapsLines.matches(line))

  Utilities.saveLines(dst,ingredients)
  Utilities.saveLines(dst,recipeTitles)

}
