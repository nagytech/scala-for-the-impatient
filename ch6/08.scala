object RGBBounds extends Enumeration {
  type RGBBounds = Value
  val Red = Value(0xFF0000)
  val Yellow = Value(0xFFFF00)
  val Green = Value(0x00FF00)
  val Cyan = Value(0X00FFFF)
  val Blue = Value(0x0000FF)
  val Magenta = Value(0xFF00FF)
  val White = Value(0xFFFFFF)
  val Black = Value(0x000000)
}

RGBBounds.White.id / 256 / 256 // 255
RGBBounds.Black.id // 0