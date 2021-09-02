object Main extends App {

  val persons = List(
    Person("Akira", "Shimura", 12),
    Person("Peter", "Muller", 34),
    Person("Nick", "Tagart", 52)
  )
  val adults = Person.filterAdult(persons)
  val descriptions = adults.map(_.description).mkString("\n\t")
  println(s"The adults are \n\t$descriptions")
}
