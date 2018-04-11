package plots

import org.scalajs.threejs.Color

/**
  * Created by Dorian Thiessen on 2018-04-05.
  */
object Colors {
  val RED_HUE_SHIFT: Double = 0.01
  val BLUE_HUE_SHIFT: Double = 0.5

  object Hex {
    val WHITE: Int = 0xffffff
    val GRAY: Int = 0xaaaaaa
    val BLACK: Int = 0x000000
  }
  val AquaBlue: Int = 0x71c8e5
  val Orange: Int = 0xe58e71 // AquaBlue's complement
  val Indigo: Int = 0x8e71e5
  val PaleGreen: Int = 0xc8e571 // Indigo's complement

  val MintGreen: Int = 0x71e58e

  val Black: Color = new Color(Hex.BLACK)
  val White: Color = new Color(Hex.WHITE)

  val Red: Color = new Color(0xff0000)
  val Green: Color = new Color(0x00ff00)
  val Blue: Color = new Color(0x0000ff)
}

