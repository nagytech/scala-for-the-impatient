abstract class Item {
  def price: Double
  def description: String
}

class SimpleItem(val price: Double, val description: String) 
  extends Item

class Bundle(val description: String) extends Item {
  import scala.collection.mutable.ArrayBuffer
  private val items = new ArrayBuffer[Item]
  def addItem(item: Item) {
    items += item
  }
  def price(): Double = {
    items.map(_.price).sum
  }
}