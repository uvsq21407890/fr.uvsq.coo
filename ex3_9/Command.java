package fr.uvsq.coo.ex3_9;

import java.util.Stack;

abstract public class Command implements Cloneable  {

	public abstract void execute ( ) ;
	public abstract void undo () ;
}
