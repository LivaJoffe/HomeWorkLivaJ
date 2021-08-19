object CelsiusToFerenheit extends App {


  def calculation (celsius:  Double): Double = {
    val farenheit = (celsius * 9/5 + 32)
  farenheit  }
val myResult36 = calculation (36.6)
println (s"Farenheit for 36.6 Celsius degrees is $myResult36")

  val myResult37=calculation(37)
  println (s"Farenheit for 37 Celsius degrees is $myResult37")

  val myResult48=calculation(48.5)
  println (s"Farenheit for 48.5 Celsius degrees is $myResult48")

}
