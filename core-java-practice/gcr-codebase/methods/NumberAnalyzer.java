package gcr_codebase.methods;

import java.util.*;

public class NumberAnalyzer {
    public static boolean isPositive(int num){
        return num>=0;
    }

    public static boolean isEven(int num){
        return num%2==0;
    }

    public static int compare(int a,int b){
        if(a>b) return 1;
        else if(a==b) return 0;
        else return -1;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]num=new int[5];

        for(int i=0;i<5;i++){
            System.out.print("Enter number "+(i+1)+": ");
            num[i]=sc.nextInt();

            if(isPositive(num[i])){
                System.out.print("Positive, ");
                if(isEven(num[i])){
                    System.out.println("Even");
                }else{
                    System.out.println("Odd");
                }
            }else{
                System.out.println("Negative");
            }
        }

        int result=compare(num[0],num[4]);
        System.out.print("First and last number comparison: ");
        switch(result){
            case 1->System.out.println("First is greater");
            case 0->System.out.println("Both are equal");
            default->System.out.println("Last is greater");
        }
    }
}
