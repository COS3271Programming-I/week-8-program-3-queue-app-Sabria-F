import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
		//Create the queue for the first line.
    	Queue<String> firstLine = new LinkedList<>();
		//Create the queue for the second line.
		Queue<String> secondLine = new LinkedList<>();
    	char let = 'A';
    	int time = 0;
    	int rn;
    	String person = "" + let + let + let;
		//Both lines start with one person in them.
    	firstLine.add(person);
		secondLine.add(person);
    	
		//Space for formatting.
		System.out.println("\n");

		//The code in this loop will run while the variable time is less than 40.
    	while (time < 40)
    	{	
			//Have the computer choose a random int between 0 and 15.
    		rn = (int)(Math.random() * 15);

			//If the random number is 1, 2, or 3, then add a person line 1.
    		if ((rn == 1) || (rn == 2) || (rn == 3)) {let++; person = "" + let + let +let; firstLine.add(person);}

			//If the random number is 8, 9, or 10 then add a person to line 2.
			if((rn == 8) || (rn == 9) || (rn == 10)) {let++; person = "" + let + let + let; secondLine.add(person);}

			//If the number is 4, 5, 6, or 7 then remove a person from line 1.
    		if ((rn == 4) || (rn == 5) || (rn == 6) || (rn == 7)) {firstLine.poll();}

			//If it is 11, 12, 13, or 14 then remove a person from line 2.
			if((rn == 11) || (rn == 12) || (rn == 13) || (rn == 14)) {secondLine.poll();}

			//Print out the current time, and both of the lines.
    		System.out.println("At time " + time + " : ");
			System.out.println("First line: " + firstLine);
			System.out.println("Second line: " + secondLine);

    		time ++;
    	}

		//Formatting.
		System.out.println("\n");
    }
}