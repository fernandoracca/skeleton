case class Person(firstName: String, lastName: String, age: Int) {

  def description =
    s"$firstName $lastName is $age ${if (age <= 1) "year" else "years"} old"
}

object Person {

  def filterAdult(persons: List[Person]): List[Person] = {
    persons.filter(_.age >= 18)
  }
}
