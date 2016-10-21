package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please enter a number:");
		int num = keyboard.nextInt();
		int i=1;
		while(i<=num){
			NissanTiida tiida = new NissanTiida();
			System.out.println("²Ä"+i+"¦¸©I¥s");
			tiida.tiida(i);
			i++;
		}
		
		keyboard.close();
	}

}
