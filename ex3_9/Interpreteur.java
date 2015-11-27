package fr.uvsq.coo.ex3_9;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Stack;

public class Interpreteur {
	protected Stack history = new Stack();
	protected Hashtable set = new Hashtable();

	public void session() {
		while (true) {
			Command command = getNewCommand();
			if (command instanceof Quit) {
				return;
			} else {
				command.execute();
			}
		}
	}

	protected Command getNewCommand() {

		/* String s = input . getString ( ) ; */
		Scanner s = new Scanner(System.in);
		while (!set.containsKey(s)) {
			/* display.printError("Not a valid command; try again!") ; */
			System.out.printf("Not a valid command; try again!");
			/* s = input.getString ( ) ; */
			s = new Scanner(System.in);
			String ss = String.valueOf(s);
		}
		return ((Command) set.get(s)).clone();
	}

}
