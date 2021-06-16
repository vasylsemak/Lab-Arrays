
public class MultiDimensionalArrays {

	public static void main(String[] args) {
		int[][][] my3dArray = new int[3][3][3];
		int firstElem = my3dArray[0][0][0];
		
		System.out.println("initial value " + firstElem);
		
		firstElem = 5;
		System.out.println("after asigning " + firstElem);
		
		int[][] my2DArray = {{1, 2}, {3, 4}, {5, 6}};
		System.out.println("2d array length: " + my2DArray[0].length);
		
		int numFourOf2D = my2DArray[1][1];
		System.out.println("2d fourth element: " + numFourOf2D);
		
	}

}
