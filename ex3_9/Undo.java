package fr.uvsq.coo.ex3_9;

import java.util.Stack;

public class Undo extends Command {

	protected Stack history;

	public Undo(Stack h) {
		history = h;
	}

	public void execute() {
		((Command) history.pop()).undo();
	}

	public void undo() {
	}
}