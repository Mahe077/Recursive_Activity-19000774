object Q3 extends App{
  def sum(n:Int): Int = n match{
    case 1 => 1
    case x => x + sum(x-1)
  }
  println(sum(5))
}
