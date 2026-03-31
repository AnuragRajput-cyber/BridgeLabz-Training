package gcr_codebase.control_flow;
import java.util.Scanner;
public class SumUntilZero {
	static void countSum(Scanner sc) {
        int total=0,n;
        while(true){
            n=sc.nextInt();
            if(n==0)break;
            total+=n;
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        countSum(sc);
    }
}
