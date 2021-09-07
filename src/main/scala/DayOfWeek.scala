object DayOfWeek extends App {

  def getDayOfWeek(dayIndex: Int):String = dayIndex match {

    case 1 => "Monday"
    case 2 => "Tuesday"
    case 3 => "Wednesday"
    case 4 => "Thursday"
    case 5 => "Friday"
    case 6 => "Saturday"
    case 7 => "Sunday"
    case _ => "Unknown weekday"
  }

   for (d <- 0 to 8) println(getDayOfWeek(d))





}
