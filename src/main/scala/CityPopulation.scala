object CityPopulation extends App {
  println("Function to calculate city growth")
  //TODO write a function getCityYear which takes the following 4 parameters
  //p0: Int - how many people are in beginning
  //perc: Int - yearly growth rate in percentages
  //delta: Int - how many people immigrate(+)/emigrate to the city each year
  //targetPopulation: Int - population we want to reach

  //we want to return the year city will reach targetPopulation
  //or we return -1 if the city will NEVER reach the population
  //it is a little bit tricky because we do not want to use return statements
  //we want to return the last line only
  //so you probably want to use some variable to hold the result
  //you will need a loop - while probably
  //you will need some if else statements
  //if we write comments /**
  //those are so called ScalaDoc style comments and they can be used by automatic tools to create documentation

  // */

  /**
   * getCityYear
   *
   * @param p0               - original City population
   * @param percentage       - yearly growth rate in percentages
   * @param delta            - how many people immigrate(+)/emigrate to the city each year
   * @param targetPopulation - population we want to reach
   * @return number of years to reach , -1 if not reachable
   */
  var counter = 0
  def getCityYear(p0: Double, percentage: Double, delta: Double, targetPopulation: Double): Double = {
    var newPopulation = p0
    if (delta < 0) println("Number of years when city will reach target population is -1")
    else if ((delta<0) && (math.abs(delta) < (p0 * (percentage / 100))) )println (s"Number of years when city will reach target population is -1")
    else {
      while (newPopulation<= targetPopulation) {
        newPopulation = (newPopulation*(percentage/100)) + newPopulation + delta //should be 20+1000+50=1070
        counter += 1
      }

      println(s"Number of years when city will reach target population is $counter")
    }
    p0
  }
  val myResult = getCityYear(1500000, 2.5, 10000, 2000000)


}