class Fraction(numerator: Int, denominator: Int) {
    val numerator: Int
    val denominator: Int

    init {
        fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
        val gcd = gcd(numerator, denominator)
        this.numerator = numerator / gcd
        this.denominator = denominator / gcd
    }

    //Fraction + Fraction
TODO()

    override fun toString(): String = "$numerator/$denominator"

}

//Int + Fraction
TODO()
