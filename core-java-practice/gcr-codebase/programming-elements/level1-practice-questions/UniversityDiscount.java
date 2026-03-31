package gcr_codebase;

public class UniversityDiscount {
	public static void main(String[] args) {
		int fee=125000;
		int discountedPercentage=10;
		System.out.println("The discount amount in INR is "+(fee*discountedPercentage)/100+" and discounted fee in INR is "+(fee-(fee*discountedPercentage)/100)+".");
	}
}
