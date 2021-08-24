object FizzBuzzCollections extends App {
  val myNumbers = (1 to 100).toArray

  def getFizzBuzzText(n: Int)= {

    if (n % 5 == 0 && n % 7 == 0) s"FizzBuzz"
    else if (n % 5 == 0 && n % 7 != 0) s"Fizz"
    else if (n % 5 != 0 && n % 7 == 0) s"Buzz"
    else s"$n"
  }

  val myFizzBuzz = for (n <- myNumbers) yield getFizzBuzzText(n)
  myFizzBuzz.foreach(println)

  val myFizzBuzzToo = myNumbers.map(n => getFizzBuzzText(n))
  myFizzBuzzToo.foreach(println)
}


