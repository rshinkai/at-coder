package at.coder.samples.slidingwindow

class MaximumSumSubarrayOfSizeK

fun main() {
    val result = findMaxSumSubArray(3, arrayOf(2, 1, 5, 1, 3, 2))
    println(result)
}

fun findMaxSumSubArray(k: Int, arr: Array<Int>): Int {
    var windowSum = 0
    var maxSum = 0
    var windowStart = 0
    for (windowEnd in arr.indices) {
        windowSum += arr[windowEnd] // add the next element
        // slide the window, we don't need to slide if we've not hit the required window size of 'k'
        if (windowEnd >= k - 1) {
            maxSum = Math.max(maxSum, windowSum)
            windowSum -= arr[windowStart] // subtract the element going out
            windowStart++ // slide the window ahead
        }
    }

    return maxSum
}