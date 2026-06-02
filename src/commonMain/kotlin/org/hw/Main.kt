package org.hw
import dev.songzh.function.trace.Trace
@Trace
fun computeFactorial2(n: Long): Long {
    if (n <= 1) return 1L
    return n * computeFactorial2(n - 1)
}
fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")
    computeFactorial2(5)
    for (i in 1..5) {
        println("i = $i")
    }
}
