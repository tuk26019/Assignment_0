import java.util.Scanner

open class Triangle(_name: String) : Shape(_name) {
    var sideA: Double = 0.0
    var sideB: Double = 0.0
    var sideC: Double = 0.0

    override fun setDimensions(scanner: Scanner) {
        sideA = scanner.nextDouble()
        sideB = scanner.nextDouble()
        sideC = scanner.nextDouble()
    }

    override fun printDimensions() {
        println("Dimensions of $name : Side A: $sideA, Side B: $sideB, Side C: $sideC")
    }

    override fun getArea(): Double {
        val s = (sideA + sideB + sideC) / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}