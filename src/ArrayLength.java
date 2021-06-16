
public class ArrayLength {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("arr length is " + arr.length);
		
		String[] languages = new String[3];
		languages[0] = "SQL";
		languages[1] = "Java";
		languages[2] = "JavaScript";
		System.out.println("laguages array length: " + languages.length);
		System.out.println("second element is: " + languages[2]);
	}
}
