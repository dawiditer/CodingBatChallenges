package recursion1;

public class CountAbc {
	/**
	 * Count recursively the total number of "abc"
	 * substrings that appear in the given string.
	 * @param str
	 * @return 
	 */
	public static int countAbc(final String str) {
		int foundAt = str.indexOf("abc");
		return foundAt < 0 ? 0 : countAbc(str.substring(foundAt + 3)) + 1;
	}
	public static void main(String[] args) {
		System.out.println(countAbc("abababc"));
		System.out.println(countAbc("abaxcababcab"));
		System.out.println(countAbc("ababcacbabcxcababc"));
	}

}
