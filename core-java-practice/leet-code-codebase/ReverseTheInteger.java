import java.util.*;

public class ReverseTheInteger{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int inv = 0;
        byte dig = 1;
        while( num != 0 ){
            inv +=  dig * (int) Math.pow(10, ( num % 10 ) - 1 );
             num = num / 10 ;
             dig++;
        }
        System.out.println(inv);

    }
}
