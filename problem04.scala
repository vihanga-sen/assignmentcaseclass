package caseclasspack4

object problem04 {
  def main(args:Array[String]) {
    val n1=Point(3,6);
    val n2=n1.Invertion();
    println(n2);
  }
}

case class Point(a:Int,b:Int) {
  def m:Int=a;
  def n:Int=b;

  def Invertion() = Point(this.n,this.m);
}
