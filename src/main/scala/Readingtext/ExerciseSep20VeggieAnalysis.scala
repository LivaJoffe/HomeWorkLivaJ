package Readingtext

object ExerciseSep20VeggieAnalysis extends App {
  val srcFile = "src/resources/csv/veggie_prices_21.csv"
  val lines = Utilities.getLinesFromFile(srcFile)
  val splitLines = lines.map(_.split(",")) //so we told how to split each line
  def arrayToVeggie(arr:Array[String]):Veggie = {
    Veggie(arr(0), arr(1), arr(2), arr(3), arr(4).toDouble, arr(5))
  }
  val veggieLines = splitLines.tail.map(line => arrayToVeggie(line)) //so map is a loop we just loop through
  println(s"There are ${veggieLines.length} items in price database")

  //TODO get the top 5 most expensive apple entries
  //TODO get the least expensive 5 apple entries

  //TODO get average price for lettuce
  //TODO extra credit get average price for lettuce by year

  val lettuce = veggieLines.filter(_.item.contains("lettuce"))
  //lettuce.slice(0,7).foreach(println)
  val apples = veggieLines.filter(_.item.contains("apple"))
  //apples.slice(0,10).foreach(println)
  val sortedApples = apples.sortBy(_.price)
  println("The 5 most expensive apple entries are")
  sortedApples.reverse.slice(0,5).foreach(println)
  println("The 5 least expensive apple entries are")
  sortedApples.slice(0,5).foreach(println)
  val lettucePrices = lettuce.map(_.price)
  val avgLettucePrice = lettucePrices.sum/lettuce.length
  val avgLettucePriceRounded = BigDecimal(avgLettucePrice).setScale(2,BigDecimal.RoundingMode.HALF_UP)
  println(s"The average price for lettuce is $avgLettucePriceRounded ")





}
