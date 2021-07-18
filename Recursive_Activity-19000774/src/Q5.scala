import Q4.isEven
object Q5 extends App{
  def sumEven(n:Int):Int = n match{
    case 0 => 0
    case x if(isEven(x)) => x + sumEven(x-1)
    case _ => sumEven(n-1)
  }
  def driver(n:Int): Unit ={
   println(sumEven(n-1))
  }

 driver(10)


}
