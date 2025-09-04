package Games;
import java.util.Scanner;
import java.util.Random;
public class Number_Guessing_Game {
	public static void main(String[] args) {
		Random random=new Random();
		int numtoguess=random.nextInt(50)+1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Number Guessing Game");
		System.out.println("I selected a number between 1 and 50.");
		System.out.println("You have to guess the number with in five trails.");
		System.out.println("Are you Exited to start 😀?");
		int numberoftries=0;
		int guess;
		boolean gussednumber =false;
		int trail=5;
		String s=sc.next();
		if(s.equalsIgnoreCase("Yes"))
		{
			System.out.println("Enter the Guessed number: ");
			while(!gussednumber) {
				guess=sc.nextInt();
				numberoftries++;
				if (guess<0||guess>50) 
				{
					trail--;
					System.out.println("You entered out of range number!! Please enter new number & You have only "+trail+"chances");
					continue;
				}
				else if(guess<numtoguess)
				{
					trail=trail-1;
					System.out.printf("Number is greater than "+guess+" And you have only %d chances buddy %n",trail);

				}
				else if(guess>numtoguess)
				{
					trail = trail-1;
					System.out.printf("Number is below than "+guess+" And you have only %d chances buddy %n",trail);

				}
				else if(guess==numtoguess) 
				{
					gussednumber=true;
					System.out.println("You Did it buddy🤩");
					System.out.println("Congratulations! You've guessed the number in " + numberoftries + " tries.");
				}
				if(trail==0){
					System.err.printf("Oops you lost it buddy 👎 the number is \"%d\" better luck next time",numtoguess);
					break;
				}	
			}
		}
		else 
		{
			System.out.println("Okay See you later 😊!!");
		}	
		sc.close();
	}
}
