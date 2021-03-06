package lab6;
//Kavitha & Riley
import java.util.Random;
import java.util.Scanner;

public class RollingDice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String again;
		int num, num1, num2;
		int rollCount=0;
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println("How many sides shoud each die have?: ");
		num = scnr.nextInt();
		do {
			rollCount++;
			System.out.println("\nRoll# " + rollCount+":");
			num1 = generateRandomDieRoll(num);
			System.out.println(num1);
			num2 = generateRandomDieRoll(num);
			System.out.println(num2);
			if(num==6) {
			isSnakeEyes(num1, num2);
			isBoxCars(num1, num2);
			isCraps(num1,num2);
			}
			System.out.println("\nDo you want to roll again?(y/n):");
			again = scnr.next();
		} while (again.equalsIgnoreCase("y"));
		System.out.println("\nThanks for using the Casino App!");
		scnr.close();
	}
	public static void isCraps(int res1, int res2) {
		int tot=res1+res2;
		if ((tot == 2) || (tot == 3) || (tot==12)) {
			System.out.println("Craps!");
		}
	}

	public static void isBoxCars(int res1, int res2) {
		int tot=res1+res2;
		if (tot == 12) {
			System.out.println("Boxcars!");
		}
	}

	public static void isSnakeEyes(int res1, int res2) {
		int tot=res1+res2;
		if (tot == 2) {
			System.out.println("Snake Eyes!");
		}
	}

	public static int generateRandomDieRoll(int sides) {
		Random rand = new Random();
		// nextInt returns a value between 0 and sides-1. So, adding 1:
		int dice = rand.nextInt(sides) + 1;
		return dice;
	}
}
