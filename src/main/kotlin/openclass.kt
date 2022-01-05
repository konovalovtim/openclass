fun main() {
    val a = SampleMath(24, 8)
    val b = SampleFloat(2.4f, 8.2f)
    val c = SampleDouble(2.4, 8.2)

    print("сложение - ${a.addition()}, ")
    print("вычетание - ${a.subtraction()}, ")
    print("умножение - ${a.multiplication()}, ")
    println("деление - ${a.division()} ")

    print("сложение - ${b.addition()}, ")
    print("вычетание - ${b.subtraction()}, ")
    print("умножение - ${b.multiplication()}, ")
    println("деление - ${b.division()} ")

    print("сложение - ${c.addition()}, ")
    print("вычетание - ${c.subtraction()}, ")
    print("умножение - ${c.multiplication()}, ")
    print("деление - ${c.division()}")
}
