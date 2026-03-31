package gcr_codebase.methods;

import java.util.Scanner;

public class DividingChocolates {
    public static int[] divideChocolates(int total, int person) {
        return new int[]{total / person, total % person};
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int total= sc.nextInt();
        int person=sc.nextInt();

        int[]res =divideChocolates(total,person);
        System.out.println("Each person gets: " +res[0]+" chocolates, Remaining: " +res[1]);
    }
}
