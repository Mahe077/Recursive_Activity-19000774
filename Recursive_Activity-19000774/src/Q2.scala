import Q1.prime
object Q2 extends App{
  def primeseq(n:Int): Unit = n match{
    case 1 => 0
    case x => primeseq(x-1); if (prime(n)) println(n)
  }
  def primeSeq(n:Int): Unit ={
    primeseq(n-1)
  }
  primeSeq(10)
}
