object Strings {
    implicit class StringGrower(s : String) {
        def grow(c : Char, n : Int) : String = {
            val split = s.split(c)
            var growth = ""
            for (i <- 0 to n) {
                growth += c
            }
            return split(0) + growth + split(1)
        }
    }
}