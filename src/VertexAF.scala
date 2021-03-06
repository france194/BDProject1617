import scala.collection.mutable.MutableList

/*
*  BigData project 2017, Frequent Pattern Mining on Labeled Oriented Single Graph
*  @authors { Francesco Contaldo, Alessandro Rizzuto}
*
* */

//Class used to represent a candidate node
class VertexAF (id:String) extends Serializable{
  var adjencies: MutableList[(VertexAF,String)]=MutableList.empty[(VertexAF,String)] //adjacencies list for each node
  val vid:String=id; //label
  def addEdge(dest:VertexAF,hour:String) {
    adjencies+:=(dest,hour)
  }
  def getAdjencies():MutableList[(VertexAF,String)] ={
    return adjencies
  }

  //override def toString: String = super.toString
  def toPrint() {
    printf("\nVertex "+vid+" adjencyList -> ")
    for(el <- adjencies){
      printf(" "+el._1.vid+" h: "+el._2+" ")
    }
    printf("\n")
  }
}
