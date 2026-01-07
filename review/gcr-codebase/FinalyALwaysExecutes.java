package reviews;

public class FinalyALwaysExecutes {
	public static void main(String[] args) {
		int[]arr= {1,4,3,5};
		try {
			System.out.println("Index after last: "+arr[arr.length] );
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Out of Bound");
		}
		finally{
			System.out.println("Exception Handlled");
		}
	}
}
