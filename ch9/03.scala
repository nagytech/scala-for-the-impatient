scala.io.Source.stdin.mkString.split("\\W+").filter(_.length > 12).foreach(println)

// this is a senternce with some words.
// some words have very many characters
// while others do not.
// vocabulary isn't a word that is long
// but parameterized is rather long.
//
// see also
//  floating-point (oopsie, bad regex)
//  gainfulnesses
//  zealousnesses