class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val firstMap = mutableMapOf<Char, Int>()
        val secondMap = mutableMapOf<Char, Int>()

        for (ch in s) {
            val currentCount = firstMap[ch] ?: 0
            firstMap[ch] = currentCount + 1
        }

        for (ch in t) {
            val currentCount = secondMap[ch] ?: 0
            secondMap[ch] = currentCount + 1
        }

        return firstMap == secondMap
    }
}
