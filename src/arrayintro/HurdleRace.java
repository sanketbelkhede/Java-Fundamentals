package arrayintro;

import java.util.Scanner;

/*
A video player plays a game in which the character competes in a hurdle race.
Hurdles are of varying heights, and the characters have a maximum height they can jump.
There is a magic potion they can take that will increase their maximum jump height by
1 unit for each dose. How many doses of the potion must the character take 
to be able to jump all of the hurdles.
If the character can already clear all of the hurdles, return 0.
*/

class Doses {
	int requiredDose(int k, int hurdle[]) {
		int max = -1;
		for(int i=0; i<hurdle.length; i++) {
			if(hurdle[i] > max) {
				max = hurdle[i];
			}
		}
		
		if(max>k) {
			return max-k;
		}
		else return 0;
	}
}

public class HurdleRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter nummber of hurdles : ");
		int totalHurdles = input.nextInt();
		int hurdle [] = new int[totalHurdles];
		for(int i=0; i<totalHurdles; i++) {
			System.out.print("Enter the height of hurdle " + (i+1) + " : ");
			hurdle[i] = input.nextInt();
		}
		
		System.out.print("Enter the height : ");
		int k = input.nextInt();
		Doses dose = new Doses();
		int result = dose.requiredDose(k, hurdle);
		System.out.println(result);
		

	}

}
