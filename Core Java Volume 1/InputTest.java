import java.util.*;
import java.io.*;

public class InputTest {
  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("What is your name?");
		String name = in.nextLine();

		System.out.print("How old are you?");
		int age = in.nextInt();

		System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));

		Console cons = System.console();
		String usearname = cons.readLine("Usear name: ");
		char[] passwd = cons.readPassword("Password: ");

		System.out.println("name: " + usearname);
		// System.out.println("password: " + Arrays.toString(passwd));
		System.out.println("password: " + new String(passwd));
	}
}
