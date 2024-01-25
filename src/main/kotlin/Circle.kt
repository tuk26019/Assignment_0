import java.util.Scanner

class Circle(_name: String) : Shape(_name) {
    var radius: Double = 0.0

    override fun setDimensions(scanner: Scanner) {
        radius = scanner.nextDouble()
    }

    override fun printDimensions() {
        println("Dimensions of $name : Radius: $radius")
    }

    override fun getArea(): Double {
        return Math.PI * radius * radius
    }
}