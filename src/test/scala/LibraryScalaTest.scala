import org.scalatest.{Matchers, GivenWhenThen, FeatureSpec}

class LibraryScalaTest extends FeatureSpec with Matchers with GivenWhenThen {
  info("I, as a Programmer")
  info("Want that the Library.someLibraryMethod be executed")
  info("For always returning it true")

  feature("Assure that Library.someLibraryMethod returns always true") {
    Given("a Library object")
    val library = new Library

    When("I call someLibraryMethod")
    val result = library.someLibraryMethod()

    Then("The result must be true")
    result shouldBe true
  }
}