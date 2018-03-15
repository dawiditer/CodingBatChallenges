package backtracking;

public class GroupSum5 {
	/**
	 * Given an array of ints, is it possible to choose a group of 
	 * some of the ints, such that the group sums to the given 
	 * target with these additional constraints: 
	 * all multiples of 5 in the array must be included in the group. 
	 * If the value immediately following a multiple of 5 is 1, 
	 * it(the 5) must not be chosen.
	 * 
	 * @param start
	 * @param nums
	 * @param target
	 * @return
	 */
	public static boolean groupSum5(
			final int start,
			final int[] nums,
			final int target) {
		if (start >= nums.length) {
			return target == 0;
		}
		
		boolean rootChildren = groupSum5(start + 1, nums, target - nums[start]);
		// if you are about to ignore the node and its a multiple of 5, false 
		if (nums[start] % 5 == 0 && (!rootChildren || nums[start + 1] == 1)) {
			return false;
		} else if (rootChildren) {
			return true;
		}
		// backtrack/prune
		// pruning by not including the node as part of the solution
		if (groupSum5(start + 1, nums, target)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 1, 5, 5, 5, 4, 1};
		int[] nums4 = {2, 1, 5, 5, 1, 5, 4, 1};
		int[] nums2 = {2, 5, -5, 5, 4, 1};
		int[] nums3 = {1, 4, 6, 10, 15};
		
		System.out.println(groupSum5(0, nums, 19) );
		System.out.println(groupSum5(0, nums4, 17) );
		System.out.println(groupSum5(0, nums2, 12) );
		System.out.println(groupSum5(0, nums3, 19) );
	}
}
