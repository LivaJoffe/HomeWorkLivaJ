import scala.io.StdIn.readLine

object MapsExercise extends App {

  println("Split sentence into words")
  println("Create a mapping of words to word lengths")

  val sentence = readLine("What is your sentence friend?")
  val words = sentence.split(" ")
  val myMap= (for (word <- words) yield (word, word.length)).toMap
  println (myMap)

}


