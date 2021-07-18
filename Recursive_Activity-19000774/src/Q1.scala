object Q1 extends App{
  def gcd (a:Int,b:Int):Int = b match{
    case 0 => a
    case x if x>a => gcd(x,a)
    case _ => gcd(b,a%b)
  }
  def prime( n:Int , y :Int = 2):Boolean = y match{
    case x if (n == x) => true
    case x if (gcd(n,x)>1) => false
    case x => prime(n,x+1)
  }

  println(prime(8),prime(5))
}
