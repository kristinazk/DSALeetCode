/*
This file contains the solution to the following LeetCode problem:
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

----------------------------------------------------------------------
The output after submitting:
Accepted : 54 / 54 testcases passed
Runtime : 5ms, Beats 58.12%
Memory : 44.24MB, Beats 83.81%

To reduce the time complexity to O(n) and traverse both Strings once, we will keep track of visited
characters via an Array.
 */

package ArrayCourse;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        // check if the lengths match
        if (s.length() != t.length()) return false;

        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }
        for (int count : charCount) {
            if (count != 0) return false;
        }
        return true;
    }
}
