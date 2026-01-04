/*
This file contains the solution to the following LeetCode problem:

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
----------------------------------------------------------------------
The output after submitting:
Accepted: 63 / 63 testcases passed
Runtime: 2ms, Beats 99.11%
Memory: 47.28 MB, Beats 20.44%

Using a HashMap reduces the complexity since search of elements is performed in linear time O(1)
This way, the time complexity of the algorithm becomes O(n)
 */

package ArrayCourse;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] numArray, int target) {
        // intermediate data structure to store elements and their indices
        Map<Integer, Integer> elements = new HashMap<>();

        for (int i = 0; i < numArray.length; i++) {
            int complement = target - numArray[i];

            if (elements.containsKey(complement)) return new int[] {i, elements.get(complement)};

            elements.put(numArray[i], i);
        }
        // no solution found
        return new int[]{};
    }
}
