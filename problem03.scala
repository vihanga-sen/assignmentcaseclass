package caseclasspack3
import scala.math.sqrt
object problem03 {
  def main(args:Array[String]){
    val n1=Point(1,4);
    val n2=Point(4,6);
    println(n2.dis(n1))
  }
}

case class Point(n:Int,m:Int){
   def p:Int=n;
   def q:Int=m;

   def dis(that:Point) =sqrt( (this.p - that.p)*(this.p-that.p) + (this.q-that.q)*(this.q-that.q))


}
