package assignment1;
import java.util.ArrayList;


public class MultiAnsQ implements Question {

	private String q; // question
	private  ArrayList<Character> pA = new ArrayList<Character>(); // list of possible answers
	private  ArrayList<Character> aA = new ArrayList<Character>(); // list of actual answers
	
	@Override
	public int getNumAns() {
		// TODO Auto-generated method stub
		return aA.size();
	}
	
	@Override
	public void setQ(String s) {
		// TODO Auto-generated method stub
		q = s;
	}

	@Override
	public String getQ() {
		// TODO Auto-generated method stub
		return q;
	}

	@Override
	public void setPosAns(char[] c) {
		// TODO Auto-generated method stub
		for (int i = 0; i < c.length; i++)
			pA.add(c[i]);
	}

	@Override
	public char[] getPosAns() {
		// TODO Auto-generated method stub
		char[] c = new char[pA.size()];
		for (int i = 0; i < pA.size(); i++)
            c[i] = pA.get(i);
		return c;
	}

	public void setActAns(char[] c) { // overload sort of
		for (int i = 0; i < c.length; i++)
			aA.add(c[i]);
	}

	public char[] getActAns() { // overload sort of
		char[] c = new char[aA.size()];
		for (int i = 0; i < aA.size(); i++)
            c[i] = aA.get(i);
		return c;
	}

}
