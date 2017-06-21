/**
 * Created by Mia on 6/15/17.
 */
//http://www.geeksforgeeks.org/scanner-class-in-java/

import java.util.*;
class Subset_II {
    /**
     * @param nums: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }

        Subset_II sub_ii = new Subset_II();
        ArrayList<ArrayList<Integer>> results = sub_ii.subsetsWithDup(nums);
        System.out.println(results.size());
        for (ArrayList<Integer> arr: results) {
            System.out.println(arr);
        }
    }




    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        if (nums == null) return results;

        if (nums.length == 0) {
            results.add(new ArrayList<Integer>());
            return results;
        }
        Arrays.sort(nums);

        ArrayList<Integer> subset = new ArrayList<>();
        helper(nums, 0, subset, results);

        return results;


    }
    public void helper(int[] nums, int startIndex, ArrayList<Integer> subset, ArrayList<ArrayList<Integer>> results){
        results.add(new ArrayList<Integer>(subset));
        for(int i=startIndex; i<nums.length; i++){
            if (i != startIndex && nums[i]==nums[i-1]) {
                continue;
            }
            subset.add(nums[i]);
            helper(nums, i+1, subset, results);
            subset.remove(subset.size()-1);
        }
    }
}



/**
    Given a list of numbers that may has duplicate numbers, return all possible subsets

        Notice

        Each element in a subset must be in non-descending order.
        The ordering between two subsets is free.
        The solution set must not contain duplicate subsets.
        Have you met this question in a real interview? Yes
        Example
        If S = [1,2,2], a solution is:

        [
        [2],
        [1],
        [1,2,2],
        [2,2],
        [1,2],
        []
        ]
*/
/*
class Solution:
        def subsetsWithDup(self, S):
        # write your code here
        S.sort()
        p = [[S[x] for x in range(len(S)) if i>>x&1] for i in range(2**len(S))]
        func = lambda x,y:x if y in x else x + [y]
        p = reduce(func, [[], ] + p)
        return list(reversed(p))
*/
