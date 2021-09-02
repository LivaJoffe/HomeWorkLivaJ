class Animal (var animalName: String, var animalType: String, var animalLikes: String, var animalSound: String, var animalAge: Int) {

def makeSound () = println (s"$animalSound")

  def prettyPrint () ={
    println (s"My animal's name is $animalName, it's a $animalType, it likes $animalLikes, it is $animalAge years old")
  }
  def meet (contact:String): Unit =
{ val friendlyContact ="friendly"
  val unfriendlyContact ="unfriendly"
  if (contact == friendlyContact) println("greet")
  else if (contact == unfriendlyContact) println("run away")
  else println("unclear if the contact is friendly or unfriendly")

}
}
