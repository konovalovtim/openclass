class SampleDouble(a: Double, b: Double): SampleMath(a.toInt(), b.toInt()) {
    var a = a
    var b = b

    override fun addition(): Any {
        return a + b
    }

    override fun subtraction(): Any {
        return a - b
    }

    override fun multiplication(): Any {
        return a * b
    }

    override fun division(): Any {
        if (b == 0.0)
            return a / 1
        else
            return a / b
    }
}