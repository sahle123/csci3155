import org.scalatest.FlatSpec
import scala.collection.mutable.Stack

class MySpec extends FlatSpec {
  "My Code" should "recursively sum a list of integers properly" in {
    val myList = List[Int](1,2,3)

    assert(MyCode.sumList(myList) === 6)

    def expectedCount(n : Int) : Int = {
      n*(n+1)/2
    }

    (1 to 100).foreach { x =>
      assert(MyCode.sumList((1 to x).toList) === expectedCount(x))
    }
  }

  it should "sum properly sum a list of integers using the fold operation(s)" in {
    val myList = List[Int](1,2,3)

    assert(MyCode.sumList2(myList) === 6)
  }
}
