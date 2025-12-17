import java.util.*;

public class PrimeFactorization{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = 2 ;
        while( num != 1 ){
            if( n % k != 0){
                k++;
            }
            else{
                System.out.println(k);
               num = num / k;
            }
        }
    }
}
