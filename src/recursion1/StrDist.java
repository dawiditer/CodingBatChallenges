package recursion1;

public class StrDist {
	/**
	 * Given a string and a non-empty substring sub, 
	 * compute recursively the largest substring which starts 
	 * and ends with sub and return its length
	 * 
	 * @param str non-empty non-null String 
	 * @param sub non-empty non-null String  
	 * @return the length of the largest substring having sub 
	 *     as the head and tail of the substring. The length includes both 
	 *     the head and the tail.
	 * 
	 */
	public static int strDist(final String str, final String sub) {
		final int subLength = sub.length();
	    final int firstOccurrence = str.indexOf(sub);
	    if (firstOccurrence < 0) {
	        return 0;
	    }
	    final int nextOccurrence = str.indexOf(sub, firstOccurrence + subLength);
	    if (nextOccurrence < 0) {
	        return 0;
	    }
	    int head = firstOccurrence;
	    int tail = nextOccurrence + subLength;
	    
	    final int currentLength = tail - head;
	    final int largestLength = strDist(str.substring(firstOccurrence + subLength), sub);

	    return Math.max(largestLength, currentLength);
	}
	public static void main(String[] args) {
		int len1 = strDist("catcowcatcowscat", "cat");
		int len2 = strDist("catcowcat", "cow");
		int len3 = strDist("cat", "cat");
		int len4 = strDist("cccatcowcatxx", "cat");
		int len5 = strDist("catcowcatcowscat", "cow");
		
		System.out.println(len1);
		System.out.println(len2);
		System.out.println(len3);
		System.out.println(len4);
		System.out.println(len5);
	}

}
