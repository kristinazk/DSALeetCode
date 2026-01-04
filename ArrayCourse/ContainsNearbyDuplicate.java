/*
This file contains the solution to the following LeetCode problem:

Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array
such that nums[i] == nums[j] and abs(i - j) <= k.

----------------------------------------------------------------------
The output after submitting:
Accepted : 65 / 65 testcases passed
Runtime: 24ms, Beats 58.14%
Memory: 76.35 MB, Beats 71.09%

By using a HashSet and a sliding window, the time complexity of the following problem becomes O(n).
 */


package ArrayCourse;

import java.util.Set;
import java.util.HashSet;

public class ContainsNearbyDuplicate {
    public static boolean containsNearbyDuplicate(int[] numArray, int k) {
        Set<Integer> numsVisited = new HashSet<>();

        for (int i = 0; i < numArray.length; i++) {
            if (numsVisited.contains(numArray[i])) return true;
            numsVisited.add(numArray[i]);
            if (numsVisited.size() > k){
                numsVisited.remove(numArray[i - k]);
            }
        }
        return false;
    }
}
