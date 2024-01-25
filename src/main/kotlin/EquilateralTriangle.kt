import java.util.Scanner

class EquilateralTriangle(_name: String) : Triangle(_name) {
    override fun setDimensions(scanner: Scanner) {
        val side = scanner.nextDouble()
        sideA = side
        sideB = side
        sideC = side
    }

    override fun printDimensions() {
        println("Dimensions of $name : Side: $sideA")
    }
}