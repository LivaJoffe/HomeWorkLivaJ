import java.util.Calendar
import scala.io.StdIn.readLine

object YearNameAge extends App {

 // val currentYear = readLine ("What year is it?").toInt
  val now =Calendar.getInstance()
  val currentYear=now.get(Calendar.YEAR)
  val userName = readLine ("What is your name?")
  val userAge = readLine ("How old are you?").toInt
  val age=100
  val userAge100 = (age-userAge+currentYear)
  println (s" $userName, You will be 100 years old on year $userAge100")
}
