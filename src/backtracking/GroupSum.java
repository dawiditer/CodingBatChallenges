package backtracking;

public class GroupSum {
	/**
	 * Given an array of ints, is it possible to choose a group 
	 * of some of the ints, such that the group sums to the given target?
	 * 
	 * @param start
	 * @param nums
	 * @param target
	 * @return
	 */
	public static boolean groupSum(
			final int start,
			final int[] nums, 
			final int target) {
		// check if c can be completed to a valid solution
		// ie, check if the target is reachable from here
		// if we are at the end, its not reachable
		// if the target has already been reached
		if (start >= nums.length) {
			return false;
		}
		if (nums[start] - target == 0) {
			return true;
		}
		
		// if all the subtrees from this node lead to an answer, return true
		if (groupSum(start + 1, nums, target - nums[start])) {
			return true;
		}
		// ignore this node entirely and go to the next node
		if (groupSum(start + 1, nums, target)) {
			return true;
		}
		return false;
	}
	public static boolean groupSumProvided(int start, int[] nums, int target) {
		  // Base case: if there are no numbers left, then there is a
		  // solution only if target is 0.
		  if (start >= nums.length) return (target == 0);
		  
		  // Key idea: nums[start] is chosen or it is not.
		  // Deal with nums[start], letting recursion
		  // deal with all the rest of the array.
		  
		  // Recursive call trying the case that nums[start] is chosen --
		  // subtract it from target in the call.
		  if (groupSum(start + 1, nums, target - nums[start])) return true;
		  
		  // Recursive call trying the case that nums[start] is not chosen.
		  if (groupSum(start + 1, nums, target)) return true;
		  
		  // If neither of the above worked, it's not possible.
		  return false;
		}
	public static void main(String[] args) {
		int[] nums = {-2, -4, 6};
		int[] nums2 = {2, 4, 8};
		System.out.println(groupSum(0, nums, 0));
		System.out.println(groupSumProvided(0, nums, 0));		

		System.out.println(groupSum(0, nums2, 14));
		System.out.println(groupSumProvided(0, nums2, 14));

		System.out.println(groupSum(0, nums2, 9));
		System.out.println(groupSumProvided(0, nums2, 9));
	}

}
