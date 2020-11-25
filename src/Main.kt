fun main(args: Array<String>) {

    val figure1 = Square(10, 0)
    println("------Square------\nW: " + figure1.width)
    figure1.width = 5
    println("W: " + figure1.width + "\nDiagonal: " + figure1.getDiagonal())
    figure1.width = -8
    println("W: " + figure1.width + "\n-----Rectangle-----")

    val figure2 = Rectangle(6, 9, 0)
    println("W: ${figure2.width}, H: ${figure2.height}  ")
    println("Diagonal: " + figure2.getDiagonal())
    println("Area: " + figure2.getArea())



}