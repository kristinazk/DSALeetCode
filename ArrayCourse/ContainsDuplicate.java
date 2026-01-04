/*
This file contains the solution to the following LeetCode problem:

Given an integer array nums, return true if any value appears at least twice in the array, and return
false if every element is distinct.

----------------------------------------------------------------------
The output after submitting:
Accepted : 77 / 77 testcases passed
Runtime : 14ms, Beats 86.64%
Memory : 93.63MB, Beats 32.68%

The solution consists of using a HashSet to keep track of every element already visited. So that the checking
time will be O(1). The overall time complexity of this solution becomes O(n).
 */

package ArrayCourse;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] numArray){
        Set<Integer> numVisited = new HashSet<>();

        for(int num : numArray){
            if(numVisited.contains(num)) return true;
            numVisited.add(num);
        }
        return false;
    }
}
