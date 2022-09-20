package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The amount of money that you start with:");
		int startAmount = in.nextInt();
		System.out.println("The win probability is:");
		double winChance = in.nextDouble();
		System.out.println("The upper limit of money you try to win:");
		int winLimit = in.nextInt();
		System.out.println("The number of days you will simulate:");
		int totalSimulations = in.nextInt();
		
		for (int i = 1;i <= totalSimulations;i++) {
			int numberRun = 0;
			int currentMoney = startAmount;
			while (currentMoney < winLimit && currentMoney > 0) {
				double t = Math.random();
				boolean winOrNo = t < winChance;
				if (winOrNo) {
					currentMoney = currentMoney + 1;
					
				}else {
					currentMoney = currentMoney - 1;
				}
				numberRun++;
			}
			if(currentMoney >= winLimit) {
				System.out.println("Simulation " + i + ": " + numberRun + " WIN");
			}
			if(currentMoney <= 0) {
				System.out.println("Simulation " + i + ": " + numberRun + " LOSE");
			}
			
			
		}
		
	}
}