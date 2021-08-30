package caseclass

object problem01 {
  def main(args:Array[String]){
    val x=Point(2,3);
    val y=Point(2,4);


    println(x);
    println(y);
    println(x+y);
  }
}

case class Point(a:Int,b:Int) {
  def m:Int=a;
  def n:Int=b;

  def +(that:Point)=Point(this.m+that.m,this.n+that.n);
}
