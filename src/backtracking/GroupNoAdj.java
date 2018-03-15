package backtracking;

public class GroupNoAdj {
	/**
	 * Given an array of ints, is it possible to 
	 * choose a group of some of the ints, 
	 * such that the group sums to the given target with 
	 * this additional constraint: If a value in the array is 
	 * chosen to be in the group, the value immediately following 
	 * it in the array must not be chosen
	 * 
	 * @param start
	 * @param nums
	 * @param target
	 * @return
	 */
	public static boolean groupNoAdj(
			final int start, 
			final int[] nums,
			final int target) {
		if (start >= nums.length) {
			return false;
		}
		if (nums[start] - target == 0) {
			return true;
		}
		
		if ((groupNoAdj(start + 2, nums, target - nums[start]))) {
			return true;
		}
		if ((groupNoAdj(start + 1, nums, target))) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] nums = {2, 5, 10, 4, 50};
		System.out.println(groupNoAdj(0, nums, 12));
		System.out.println(groupNoAdj(0, nums, 14));
		System.out.println(groupNoAdj(0, nums, 17));
		System.out.println(groupNoAdj(0, nums, 6));
		System.out.println(groupNoAdj(0, nums, 52));
		System.out.println(groupNoAdj(0, nums, 55));
	}
}
