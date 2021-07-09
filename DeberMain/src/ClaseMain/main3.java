package ClaseMain;

import java.util.Scanner;

public class main3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Ingrese sus sueldo neto: ");
		Scanner Leer = new Scanner(System.in);
		
		int A = Leer.nextInt();
		int B = Leer.nextInt();
		int C = Leer.nextInt();
		
		
		
		if  (A<300) {
		    System.out.println("Recibe un bono extra de 100 dolares:");
		}

		if (B>400 && B<300) {
		    System.out.println("Recibe un bono extra de 70 dolares:");
		}

		if (C > 400) {
		    System.out.println("Recibe un bono extra de 50 dolares:");
		} else {
			int bon = A + 100;
			int bon1 = B + 70;
			int bon2 = C + 50;

			System.out.println("Su bonificacion es:"+bon2);
		}
		
		

	}
}


