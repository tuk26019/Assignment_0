import java.util.Scanner

class Square(_name: String) : Shape(_name) {
    var length: Double = 0.0
    var height: Double = 0.0

    override fun setDimensions(scanner: Scanner) {
        length = scanner.nextDouble()
        height = scanner.nextDouble()
    }

    override fun printDimensions() {
        println("Dimensions of $name : Length: $length, Height: $height")
    }

    override fun getArea(): Double {
        return length * height
    }
}