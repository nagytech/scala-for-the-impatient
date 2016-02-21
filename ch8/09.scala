class Creature {
  val range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}
// Ants, however, are near-sighted:
class Ant extends Creature { 
  override val range = 2 
  } // or --with creature--