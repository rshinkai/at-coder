package at.coder.contests

class WelcomeToAtCoder

fun main() {
    when(readLine()!!.toInt()%10){
        3->"bon"
        0,1,6,8->"pon"
        else->"hon"
    }.let(::println)
}