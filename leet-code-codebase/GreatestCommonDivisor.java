import java.util.*;
public class GreatestCommonDivisor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = sc.nextInt();
        int a = num ;
        int b = m ;
        int lcm = 0;
        while(true){
            int r = a % b ;
            if( r == 0){
                lcm = b;
                break;
            }
            b = a ;
            a = r;
        }
        int gcd =  ( m * num ) / lcm;
        System.out.println(lcm);
        System.out.println(gcd);

    }
}
