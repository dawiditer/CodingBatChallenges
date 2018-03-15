package recursion1;

public class Triangle {
	/**
	 * We have triangle made of blocks. 
	 * The topmost row has 1 block, the next row down has 2 blocks, 
	 * the next row has 3 blocks, and so on. 
	 * Compute recursively (no loops or multiplication) the 
	 * total number of blocks in such a triangle with the given number of rows.
	 * 
	 * @param rows 0 <= rows
	 * @return
	 */
	public static int triangle(final int rows) {
		if (rows == 0) {
			return 0;
		}
		if (rows == 1) {
			return 1;
		}
		int previousTriangle = triangle(rows - 1);
		
		return previousTriangle + previousTriangle + 1;
	}
	public static void main(String[] args) {
		System.out.println(triangle(0));
		System.out.println(triangle(1));
		System.out.println(triangle(2));
		System.out.println(triangle(3));
	}

}
