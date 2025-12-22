package gcr_codebase.methods;

import java.util.*;

public class RecursiveSum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n<=0){
            System.out.println("Not a natural number.");
            return;
        }

        int recurSum=sumRecursive(n);
        int formulaSum=n*(n+1)/2;
        System.out.println("Recursive Sum: "+recurSum);
        System.out.println("Formula Sum: "+formulaSum);
        System.out.println("Match: "+(recurSum==formulaSum));
    }

    public static int sumRecursive(int n){
        if(n==1) return 1;
        return n+sumRecursive(n-1);
    }
}
