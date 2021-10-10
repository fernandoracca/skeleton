import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class MainSpec extends AnyWordSpec with Matchers {
    "A Person" should {
        "be instantiated with an age and name" in {
            val john = Person(firstName = "John", lastName = "Smith", 42)
            john.firstName should be ("John")
            john.lastName should be ("Smith")
            john.age should be (42)
        }

        "get a human readable representation" in {
            val paul = Person("Paul", "Smith", 24)
            paul.description should be ("Paul Smith is 24 years old")
        }
    }

    "The Person companion object" should {
        val (akira, peter, nick) = (
            Person("Akira", "Shimura", 12),
            Person("Peter", "Muller", 34),
            Person("Nick", "Tagart", 52)
        )

        "return a list of adult persons" in {
            val ref = List(akira, peter, nick)
            Person.filterAdult(ref) should be (List(peter, nick))
        }

        "return an empty list if no adult in the list" in {
            val ref = List(akira)
            Person.filterAdult(ref) should be (List.empty[Person])
        }
    }
}