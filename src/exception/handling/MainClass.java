package exception.handling;
import java.util.Scanner;
public class MainClass extends InavalidEntry {
	public static void main(String[] args) {
			System.out.println("Enter Your Age");
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			InavalidEntry i = new InavalidEntry();
			i.CheckAge(age);
	}
}
