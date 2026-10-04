class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        nums.forEach { num ->
            val duplicate = set.add(num)
            if (!duplicate) return true
        }
        return false
    }
}
