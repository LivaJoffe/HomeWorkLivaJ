object CityPopulation extends App {
  println("Function to calculate city growth")
  var counter = 0
  def getCityYear(p0: Double, percentage: Double, delta: Double, targetPopulation: Double): Double = {
    var newPopulation = p0
    if (delta < 0) println("Number of years when city will reach target population is -1")
    else if ((delta<0) && (math.abs(delta) < (p0 * (percentage / 100))) )println (s"Number of years when city will reach target population is -1")
    else {
      while (newPopulation<= targetPopulation) {
        newPopulation = (newPopulation*(percentage/100)) + newPopulation + delta
        counter += 1
      }

      println(s"Number of years when city will reach target population is $counter")
    }
    p0
  }
  val myResult = getCityYear(1500000, 2.5, 10000, 2000000)


}