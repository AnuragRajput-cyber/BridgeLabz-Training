package gcr_codebase.methods;
import java.util.Scanner;

public class QuotientAndRemainder {
    public static int[] findRemainderAndQuotient(int num, int divi) {
        return new int[]{num%divi,num/divi};
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int divi= sc.nextInt();

        int[]res= findRemainderAndQuotient(num, divi);
        System.out.println("Quotient: " +res[1]+", Remainder: "+res[0]);
    }
}
