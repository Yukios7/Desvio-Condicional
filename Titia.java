package EDNA;

import java.util.Scanner;

public class Titia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ed = new Scanner(System.in);
		
		int edinha = ed.nextInt();
		
		if (edinha <= 14) {
			System.out.println("O n�mero � menor que 15: ");
		}
		else if (edinha >= 101) {
			System.out.println("O n�mero � maior que 100: ");
		}
		else {
			System.out.println("O valor est� entre 15 e 100: ");
		}
		
	}

}
