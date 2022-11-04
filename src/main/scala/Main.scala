import exercises.*

@main def main(): Unit =
  val myNumbers = Array(1, 2, 3, 2, 5)
  println(Ch2.isSorted(myNumbers, (a, b) => a >= b))