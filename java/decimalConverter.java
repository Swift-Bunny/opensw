package Test;

import java.util.*;

public class Jinsu{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String binary="";
		String octal="";
		String decimal="";
		String hex="";
		
		System.out.print("■ Please enter the decimal : ");
		int Decimal = sc.nextInt();
		
		System.out.print("□ Please enter the decimal to convert : ");
		
		int choose; 
		
		while(true) {
			choose = sc.nextInt();
			if((choose == 2 || choose == 8) || (choose == 10 || choose == 16)) { break; }
				System.out.print("\n※You input range error※\n▶Allowed ragne : 2,8,10,16\n\n");
				System.out.print("□ Please enter the decimal to convert : ");
		}
		
		if(choose == 2) {
			binary = Integer.toBinaryString(Decimal);
			System.out.print("\n● Conveted by binary : " + binary);
		}
		else if(choose == 8) {
			octal = Integer.toOctalString(Decimal);
			System.out.print("\n● Conveted by octal : " + octal);
		}
		else if(choose == 10) {
			decimal = Integer.toString(Decimal);
			System.out.print("\n ● Conveted decimal : " + decimal);
		}
		else {
			hex = Integer.toHexString(Decimal);
			System.out.print("\n● Conveted hex : " + hex);
		}
	}
}