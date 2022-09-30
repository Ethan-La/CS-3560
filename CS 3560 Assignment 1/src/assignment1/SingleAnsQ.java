package assignment1;
import java.util.ArrayList;


public class SingleAnsQ implements Question {

	private String q; // question
	private ArrayList<Character> pA = new ArrayList<Character>(); // list of possible answers
	private char aA; // actual answer
	
	@Override
	public int getNumAns() {
		// TODO Auto-generated method stub
		return 1;
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

	public void setActAns(char s) { // overload sort of
		aA = s;
	}

	public char getActAns() { // overload sort of
		return aA;
	}

}
