
public class DisplayingArrays {

	public static void main(String[] args) {
		
		int[] intArray = new int[3];
		System.out.println(intArray);
		
	    intArray[0] = -5123;
	    intArray[2] = 32;
	    System.out.println("first element of intArray: " + intArray[0]);
	    System.out.println("second element of intArray: " + intArray[1]);
	    System.out.println("intArray length: " + intArray.length);
	}

}
