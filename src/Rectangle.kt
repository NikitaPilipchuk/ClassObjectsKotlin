class Rectangle : Square {

    var height: Int
        set(value) {
            if (value < 0)
                field = 0
            else
                field = value
        }

    constructor(width: Int, height: Int, center: Int) : super(width, center){
        if (width < 0) {
            this.width = 0
        } else {
            this.width = width
        }

        if (height < 0) {
            this.height = 0
        } else {
            this.height = height
        }

        this.center = center
    }

    constructor() :super() {
        this.width = 4
        this.height = 6
        this.center = 0
    }

    override fun getDiagonal(): Double {
        return Math.sqrt(Math.pow(this.width.toDouble(), 2.0) + Math.pow(this.height.toDouble(), 2.0))
    }

    fun getArea(): Int {
        return this.height * this.width
    }

}