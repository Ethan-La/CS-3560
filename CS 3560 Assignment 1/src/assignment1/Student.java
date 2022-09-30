package assignment1;

import java.util.ArrayList;

public class Student {
	private String ID;
	private char sA; // answer to single question
	private  ArrayList<Character> mA = new ArrayList<Character>(); // answer to multi question
	
	public void setID(String s) {
		ID = s;
	}
	public String getID() {
		return ID;
	}
	
	public void setSA(char c) {
		sA = c;
	}
	public char getSA() {
		return sA;
	}
	
	public void setMA(char[] c) {
		for (int i = 0; i < c.length; i++)
			mA.add(c[i]);
	}
	public char[] getMA() {
		char[] c = new char[mA.size()];
		for (int i = 0; i < mA.size(); i++)
            c[i] = mA.get(i);
		return c;
	}
}
