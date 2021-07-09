package ClaseMain;

import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Leer = new Scanner(System.in);
	    System.out.printf("Introduce dos numeros para dividir\nNumero: ");
	    int num1 = Leer.nextInt();
	    System.out.printf("Numero: ");
	    int num2 = Leer.nextInt();
	    float div = num1/num2;
	    System.out.println("La division de "+num1+"/"+num2+" = " +div);

	}

}
