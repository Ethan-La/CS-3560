package assignment1;

public class Student {
	private String ID;
	private char sA; // answer to single question
	private char[] mA = new char[2]; // answer to multi question
	
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
			mA[i] = c[i];
	}
	public char[] getMA() {
		return mA;
	}
}
