import scala.io.StdIn.readLine

object XmasBonus extends App {
  println("Xmas bonus calculator")
  //TODO
  //Ask for person's name
  //Ask for how long they have worked at the firm
  //Ask for monthly wage
  //Calculate Xmas bonus if they have worked at least 2  years
  //Bonus is years worked over 2 years * 15% of monthly wage
  //so 5 years worked, 1000 Euros wage would give 450 Euro bonus (3 years * 150)

  //if they are not eligible for bonus you should say so
  val userName = readLine ("What is your name?")
  val userExperience = readLine ("For how many years have you worked at this firm?").toInt
  if (userExperience<=2) println (s"Sorry, $userName, You are not eligable for bounus yet")
  else {
    val userWage = readLine("What is your monthly wage?").toDouble
    val userBonusPerYear = userWage * 1.15 - userWage
    val xmasBonus = (userExperience - 2) * userBonusPerYear.round
    println(s" $userName, Your christmas bounus is $xmasBonus eur ")
  }
}
