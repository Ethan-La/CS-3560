package assignment1;

public interface Question {
	public int getNumAns();
	
	public void setQ(String s);
	public String getQ();
	
	public void setPosAns(char[] c);
	public char[] getPosAns();
}