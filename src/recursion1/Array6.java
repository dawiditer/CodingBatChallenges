package recursion1;

public class Array6 {
	/**
	 * Given an array of ints, 
	 * compute recursively if the array contains a 6.
	 * We'll use the convention of considering only the 
	 * part of the array that begins at the given index. 
	 * In this way, a recursive call can pass index+1 to move down the array. 
	 * The initial call will pass in index as 0.
	 * 
	 * @param nums
	 * @param index
	 * @return
	 */
	public static boolean array6(final int[] nums, final int index) {
		if (index >= nums.length) {
			return false;
		}
		
		return nums[index] == 6 ? true : array6(nums, index + 1);
	}
	public static void main(String[] args) {
		int[] nums = {1, 6, 4};
		int[] nums2 = {1, 4};
		int[] nums3 = {};
		int[] nums4 = {6};
		int[] nums5 = {6,1,2,3,4,5,6};
		System.out.println(array6(nums, 0));
		System.out.println(array6(nums2, 0));
		System.out.println(array6(nums3, 0));
		System.out.println(array6(nums4, 0));
		System.out.println(array6(nums5, 0));
	}
}
