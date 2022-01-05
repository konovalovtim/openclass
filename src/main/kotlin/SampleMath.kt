open class SampleMath {
    open var x: Int = 0
    open var y: Int = 0

    constructor(x: Int, y: Int) {
        this.x = x as Int
        this.y = y as Int
    }

    open fun addition(): Any {
        return x + y
    }

   open fun subtraction(): Any {
        return x - y
    }

    open fun multiplication(): Any {
        return x * y
    }

    open fun division(): Any {
        if (y == 0)
            return x / 1
        else
            return x / y
    }
}


