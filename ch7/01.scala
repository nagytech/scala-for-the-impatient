package com {
  package horstmann {
    class Invisible {

    }
    package impatient {

    }
  }
}

package com.horstmann.impatient
{
  class Scanner {
    val i = new Invisible // fails to compile, Invisible outside scope
  }
}