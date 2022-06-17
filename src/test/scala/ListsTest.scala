import first_lesson.Lists
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ListsTest extends AnyFlatSpec with Matchers {


  it should "check a list is NOT empty" in {
    List(Lists) should not be empty
  }

  it should "check the size of collections" in {
    val obj = List(Lists) //хочу обсудить этот момент
    obj should have size 5
  }
}