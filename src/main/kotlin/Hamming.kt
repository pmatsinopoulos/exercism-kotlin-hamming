object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        if (leftStrand.isNullOrBlank() && rightStrand.isNullOrBlank()) {
            return 0
        }
        require(leftStrand.length == rightStrand.length) { "left and right strands must be of equal length" }
        return leftStrand.foldIndexed(
            0
        ) { index, acc, c -> if (rightStrand[index] != c) acc + 1 else acc }
    }
}
