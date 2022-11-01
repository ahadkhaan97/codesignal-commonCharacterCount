fun main() {
    println(solution("a", "aaa"))
}

@Suppress("NAME_SHADOWING")
fun solution(s1: String, s2: String): Int {
    var s2 = s2
    var commonCount = 0

    for (element in s1) {
        val index = s2.indexOf(element)
        if (index != -1) {
            commonCount++
            s2 = s2.removeRange(index, index + 1)
        }
    }

    return commonCount
}