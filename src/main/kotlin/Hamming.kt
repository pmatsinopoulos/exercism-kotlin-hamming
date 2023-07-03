object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        if (leftStrand.isNullOrBlank() && rightStrand.isNullOrBlank()) {
            return 0
        }
        if (leftStrand.length != rightStrand.length) {
            throw IllegalArgumentException("left and right strands must be of equal length")
        }
        var result = 0
        leftStrand.forEachIndexed { index, c ->
            if (rightStrand[index] != c) {
                result += 1
            }
        }
        return result
    }
}
