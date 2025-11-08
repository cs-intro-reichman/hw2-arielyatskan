// Demonstrates the Collatz conjecture.

import java.lang.classfile.instruction.StackInstruction;

public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int n = Integer.parseInt(args[0]);
		String vORc = "" + args[1];
		if(vORc.equals("v")) {
			for(int i = 0; i < n; i++){
				int sum = i + 1;
				int count = 1;
				System.out.print(sum + " ");
				boolean notOne = true;
				while(notOne) {
					if(sum % 2 == 0)  sum /= 2;
					else  sum = (sum * 3) + 1;
					System.out.print(sum + " ");
					if(sum == 1)  notOne = false;
					count++;
				}
				System.out.println(" (" + count + ")");
			}
			System.out.println();
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
		else  System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
	}
}
