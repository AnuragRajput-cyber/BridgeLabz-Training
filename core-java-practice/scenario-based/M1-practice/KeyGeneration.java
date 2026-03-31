package m1.practice;

import java.util.Scanner;

public class KeyGeneration {
	public static String generateKey(String str) {
		String answer = "";
		if (str.isEmpty()) {
			System.out.println("Invalid Input (empty string)");
		} else if (str.length() < 6) {
			System.out.println("Invalid Input (length < 6)");
		} else if (str.contains(" ")) {
			System.out.println("Invalid Input (contains space)");
		} else if (str.matches(".*\\d.*")) {
			System.out.println("Invalid Input (contains digits)");
		} else if (str.matches(".*[^a-zA-Z].*")) {
			System.out.println("Invalid Input (contains special character)");
		} else {
			str = str.toLowerCase();

			StringBuilder sb = new StringBuilder();

			for (char c : str.toCharArray()) {
				if (c % 2 != 0) {
					sb.append(c);
				}
			}
			String ans = sb.reverse().toString();

			StringBuilder res = new StringBuilder();
			for (int i = 0; i < ans.length(); i++) {
				char c = ans.charAt(i);
				if (i % 2 == 0 || i == 0) {
					res.append(Character.toUpperCase(c));
				} else {
					res.append(c);
				}
			}
			answer = res.toString();
		}
		return "The generated key is - "+answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while (n-- > 0) {
			String str = sc.nextLine();
			System.out.println(generateKey(str));
		}
	}
}
