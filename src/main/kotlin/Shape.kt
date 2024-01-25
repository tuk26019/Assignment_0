import java.util.Scanner

abstract class Shape(_name: String) : Dimensionable {
    var name = _name

    abstract fun setDimensions(scanner: Scanner)

    open fun getArea(): Double {
        return 0.0
    }
}