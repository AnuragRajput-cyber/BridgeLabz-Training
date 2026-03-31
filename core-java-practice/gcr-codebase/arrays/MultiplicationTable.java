package gcr_codebase.arrays;

import java.util.Scanner;


public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int var=sc.nextInt();
		int []table=new int[10];
		
		for(int i=0;i<table.length;i++) {
			table[i]=var*(i+1);
			System.out.println(var+" * "+(i+1)+" = "+table[i]);
		}
	}
}
