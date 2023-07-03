object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        if (leftStrand.isNullOrBlank() && rightStrand.isNullOrBlank()) {
            return 0
        }
        require(leftStrand.length == rightStrand.length) { "left and right strands must be of equal length" }
        return leftStrand.zip(rightStrand).count { pair ->
            pair.first != pair.second
        }
    }
}
