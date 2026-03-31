package gcr_codebase;

import java.util.Scanner;

public class MaxHandshake {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int students=sc.nextInt();
		int maxHandShake=(students*(students-1)/2);
		System.out.println("The number of handshakes are "+maxHandShake+" for "+students+" students.");
	}
}
