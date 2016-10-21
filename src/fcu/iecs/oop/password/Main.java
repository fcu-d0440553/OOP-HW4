package fcu.iecs.oop.password;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String Str = "exit";
		boolean i;
		do{
			System.out.printf("Please enter a password:");
			String str = keyboard.next();
			i=str.equalsIgnoreCase(Str);
			PasswordEncorder password = new PasswordEncorder();
			str=password.encode(str);
			System.out.println(str);
			System.out.println(i);
		}while(!i);
		
		keyboard.close();

	}

}
