open class Square {

    var width: Int
        set(value) {
            if (value < 0)
                field = 0
            else
                field = value
        }
    var center: Int

    constructor(width: Int, center: Int) {
        if (width < 0) {
            this.width = 0
        } else {
            this.width = width
        }

        this.center = center
    }

    constructor() {
        this.width = 4
        this.center = 0
    }

    open fun getDiagonal(): Double {
        return width * Math.sqrt(2.0)
    }

}