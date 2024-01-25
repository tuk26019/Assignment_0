import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val square = Square("Square")
    val circle = Circle("Circle")
    val triangle = Triangle("Triangle")
    val equilateralTriangle = EquilateralTriangle("Equilateral Triangle")

    println("Enter length and height for ${square.name}:")
    square.setDimensions(scanner)

    println("Enter radius for ${circle.name}:")
    circle.setDimensions(scanner)

    println("Enter sides for ${triangle.name}:")
    triangle.setDimensions(scanner)

    println("Enter side for ${equilateralTriangle.name}:")
    equilateralTriangle.setDimensions(scanner)

    printShapeDetails(square)
    printShapeDetails(circle)
    printShapeDetails(triangle)
    printShapeDetails(equilateralTriangle)
}
fun printShapeDetails(shape: Shape) {
    println("Details for ${shape.name}:")
    shape.printDimensions()
    println("Area: ${shape.getArea()}")
    println()
}
