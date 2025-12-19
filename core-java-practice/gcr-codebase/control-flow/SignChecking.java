package gcr_codebase.control_flow;

import java.util.Scanner;

public class SignChecking {
    static void check(int number) {
        if (number > 0)
            System.out.println("positive");
        else if (number < 0)
            System.out.println("negative");
        else
            System.out.println("zero");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        check(num);
    }
}

