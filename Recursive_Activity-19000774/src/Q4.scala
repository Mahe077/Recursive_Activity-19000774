object Q4 extends App{
  def isEven(n:Int): Boolean = n match {
    case 0 => true
    case _ =>  isOdd(n-1)
  }
  def isOdd(n:Int):Boolean = !isEven(n)

  def EvenOdd(n:Int): Unit = {
    if(isEven(n)) print("Even")
    else print("Odd")
  }

  EvenOdd(5)
}
