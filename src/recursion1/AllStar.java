package recursion1;

public class AllStar {
	/**
	 * Given a string, compute recursively a new 
	 * string where all the adjacent chars are now separated by a "*".
	 * 
	 * @param str
	 * @return
	 */
	public static String allStar(final String str) {
		return (str.length() <= 1) ? 
				str : str.charAt(0) + "*" + allStar(str.substring(1));
	}
	public static void main(String... args) {
		System.out.println(allStar("hello"));
		System.out.println(allStar("h"));
		System.out.println(allStar("ab"));
	}
}
