// Transposes the text Hello World
// so that it prints vertically on 
// the screen

"Hello".zip("World") foreach { set =>
      println(set._1 + " " + set._2)
}