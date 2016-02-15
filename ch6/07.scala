object PlayingCardSuit extends Enumeration {
  type PlayingCardSuit = Value
  val Club = Value("♣")
  val Diamond = Value("♦")
  val Heart = Value("♥")
  val Spade = Value("♠")

  def isSuitRed(suit: PlayingCardSuit): Boolean = {
    suit == Diamond || suit == Heart
  }

}