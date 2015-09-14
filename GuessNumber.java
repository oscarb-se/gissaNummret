
  
import java.util.Random;
import java.util.Scanner;
 
public class GuessNumber {

	public static int number, guess, maxValue;
	public static Scanner scan = new Scanner(System.in);
	public static Random rand;

	public static void main(String[] args) {
		System.out.println("Ett programm där man gissar vilket nummer som har slumpats fram inom ett givet spann.");

		rand = new Random();
		System.out.println("Skriv in det nummer du tycker ska vara det högsta möjliga nummret: ");
		maxValue = scan.nextInt();
		number = rand.nextInt(maxValue);

		System.out.print("Skriv in din gissning: ");

		while (guess != number) {
			guess = scan.nextInt();
			if (guess > number) {

				System.out.println("Du gissade på ett för högt nummer");
			} else if (guess < number) {
				System.out.println("Du gissade på ett för lågt nummer");

			}
		}
		System.out.println("Grattis, du har gissat rätt!");
		
//		System.out.println("Lägger in en loop för att kunna se förändringen i filen på GitHub");
//		for(int i = 0; i < 10; i++){
//			System.out.println("i = " + i );
//		}
//		
//		System.out.println("Lägger in en förändring för att testa på GitHub");
//		int i = 0; 
//		System.out.println("Värdet på i är " + i);
	}
	
	
}

 
