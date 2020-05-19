package at.coder.contests.`168`

fun main() {
    val K = readLine()!!.toInt()
    val S = readLine()!!

    if (S.length <= K) {
        println(S)
    } else {
        println(S.substring(0, K) + "...")
    }
}