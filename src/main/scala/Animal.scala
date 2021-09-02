class Animal (var animalName: String, var animalType: String, var animalLikes: String, var animalSound: String, var animalAge: Int) {

def makeSound () = println (s"$animalSound")

  def prettyPrint () ={
    println (s"My animal's name is $animalName, it's a $animalType, it likes $animalLikes, it is $animalAge years old")
  }
  def meet (contact:String): Unit =
{

}
}
//TODO add class variables name, animalType, likes, sound- all strings and age which is Int
//TODO add class method makeSound which prints sound

//BONUS
//TODO add class method meet which has a parameter of contact:String
//TODO this meet should decide whether to greet if they like the contact
//TODO to run away if they do not like the contact