package reviews;

public class SecondMaxInArray {
	public int secondMax(int[] arr) {
        int max=arr[0];
        int secondMax=Integer.MIN_VALUE;
        for (int i=1;i<arr.length;i++) {
            if (arr[i]>max) {
                secondMax=max;
                max=arr[i];
            } else if(arr[i]>secondMax&& arr[i]!=max) {
            	secondMax=arr[i];
            }
        }
        return secondMax;
    }
	public static void main(String[] args) {
		int[]arr= {1,2,87,70,10};
		SecondMaxInArray scm=new SecondMaxInArray();
		System.out.println(scm.secondMax(arr));
	}
}
