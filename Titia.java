package EDNA;

import java.util.Scanner;

public class Titia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ed = new Scanner(System.in);
		
		int edinha = ed.nextInt();
		
		if (edinha <= 14) {
			System.out.println("O número é menor que 15: ");
		}
		else if (edinha >= 101) {
			System.out.println("O número é maior que 100: ");
		}
		else {
			System.out.println("O valor está entre 15 e 100: ");
		}
		
	}

}
