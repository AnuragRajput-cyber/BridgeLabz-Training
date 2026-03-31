package m1.practice;

import java.time.LocalDate;
import java.util.Scanner;

public class GlobalShipmentManifestValidator {
	public static void shipmentVerifier(String str) {
		String[] input = str.split("\\|");
		boolean result=false;
		if (input.length == 5) {
			String code = input[0];
			String date = input[1];
			String mode = input[2];
			String weight = input[3];
			String status = input[4];

			 result=(validateCode(code)&&validateDate(date)&&validateMode(mode)&&validateWeight(weight)&&validateStatus(status));
		}
		if(result) {
			System.out.println("COMPLIANT RECORD");
		}else {
			System.out.println("NON-COMPLIANT RECORD");
		}
	}

	public static boolean validateCode(String code) {
		return code.matches("^(?!.*(\\d)\\1\\1\\1)SHIP-[1-9][0-9]{5}$");
	}

	public static boolean validateDate(String date) {
		try {
			if (!date.matches("^20\\d{2}-\\d{2}-\\d{2}$")) {
				return false;
			}

			LocalDate.parse(date);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public static boolean validateWeight(String w) {
		if(!w.matches("(0|[1-9]\\d{0,5})(\\.\\d{1,2})?"))
            return false;

        double val = Double.parseDouble(w);
        return val <= 999999.99;
	}
	public static boolean validateMode(String mode) {
		return mode.matches("^(AIR|SEA|ROAD|RAIL|EXPRESS|FREIGHT)$");
	}
	public static boolean validateStatus(String status) {
		return status.matches("^(DELIVERED|CANCELLED|IN_TRANSIT)$");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		while (n-->0) {
			String inp = sc.nextLine();
			shipmentVerifier(inp);
		}
	}
}
