package recursion1;
 
public class CountAbcAba {
	/**
	 * Count recursively the total number of "abc" 
	 * and "aba" substrings that appear in the given string.
	 * @param str
	 * @return
	 */
	public static int countAbcAba(final String str) {
		int abFoundAt = str.indexOf("ab");
		int nextCharAt = abFoundAt + 2;
		if (abFoundAt < 0 || nextCharAt >= str.length()) {
			return 0;
		}
		char nextChar = str.charAt(nextCharAt);
		int count = (nextChar == 'c' || nextChar == 'a') ? 1 : 0;
		
		return countAbcAba(str.substring(nextCharAt + 1)) + count;
	}
	public static void main(String[] args) {
		System.out.println(countAbcAba("ab"));
		System.out.println(countAbcAba("abaxcababc"));
		System.out.println(countAbcAba("ababcacbabcxcabaabc"));
	}
}
