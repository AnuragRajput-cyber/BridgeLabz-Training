package gcr_codebase.strings;

import java.util.Scanner;

public class ArrayIndexOutBounded {
	public static void generatingException(String[]names) {
		for(int i=0;i<=names.length;i++) {
			System.out.println("names:"+names[i]);
		}
	}
	public static void handlingException(String[]names) {
		try {
			for(int i=0;i<=names.length;i++) {
				System.out.println("names:"+names[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception Handled");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Counte of Names");
		int namesCount=sc.nextInt();
		String[]names=new String[namesCount];
		System.out.println("Enter "+namesCount+" names: ");
		for(int i=0;i<names.length;i++) {
			System.out.println((i+1)+"th name:");
			names[i]=sc.next();
		}
		try {
            generatingException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred while generating");
        }

        handlingException(names);
	}
}
