import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class TheUSACapital {
  public static void main(String[] args) {
    System.out.println("Where is the capital of the U.S.");
    System.out.println("1: New York");
    System.out.println("2: Washington");
    System.out.println("3: Los Angeles");
    System.out.print("Select the number and enter : ");
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int answer = 0;
		String message = "wrong";
		try {
			String buf = bufferedReader.readLine();
			answer = Integer.parseInt(buf);
		} catch (Exception exception) {
			answer = 0;
			message = "Select the number";
		}
    if (answer == 2) {
      message = "bingo";
    }
    System.out.println(message);
  }
}
