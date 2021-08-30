package caseclasspack2

object problem02 {
  def main(args:Array[String]){
    val n1=Point(3,5);
    val n2=n1.mov(3,3);
    println(n2);
    println(n1);

  }
}

case class Point(m:Int,n:Int){
  def a:Int=m;
  def b:Int=n;

  def mov(dx:Int,dy:Int)=Point(this.a+dx,this.b+dy);



}
