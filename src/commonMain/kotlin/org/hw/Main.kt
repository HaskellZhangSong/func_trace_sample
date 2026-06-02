package org.hw
import dev.songzh.function.trace.Trace
@Trace
fun computeFactorial2(n: Long): Long {
    if (n <= 1) return 1L
    return n * computeFactorial2(n - 1)
}

class Calculator {
    fun add(a : Int, b: Int) : Int {
        return a + b
    }
}

fun get5() : Int = 5
fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")
    computeFactorial2(5)
    get5()
    val cal = Calculator()
    val a = cal.add(1,2)
}
