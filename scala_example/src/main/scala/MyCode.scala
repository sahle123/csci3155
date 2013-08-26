object MyCode {
  def sumList(a : List[Int]) : Int = {
    a match {
      case (List()) => 0
      case (a::more) => (a + sumList(more))
    }
  }

  def sumList2(l : List[Int]) : Int = {
    l.foldLeft(0) { case (res, x) =>
      res + x
    }
  }
}
