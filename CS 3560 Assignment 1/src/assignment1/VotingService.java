package assignment1;
import java.util.ArrayList;

public class VotingService {
	private ArrayList<Student> stList = new ArrayList<Student>(); // list of Students
	private  ArrayList<Character> pA = new ArrayList<Character>(); // list of possible answers
	private int numAns;
	
	public void setStList(Student[] list) {
		for (int i = 0; i < list.length; i++)
			stList.add(list[i]);
	}
	
	public void setQuestion(Question q) {
		numAns = q.getNumAns();
		char[] list = q.getPosAns();
		for (int i = 0; i < list.length; i++)
			pA.add(list[i]);
	}
	
	private int[] calcResult() {
		char[] ans = new char[pA.size()]; // list of all pos ans
		for (int i = 0; i < pA.size(); i++)
            ans[i] = pA.get(i);

		int[] res = new int[pA.size()]; // ans counter
		
		for (int k = 0; k < ans.length; k++) // loop through pos ans
		{
			for (int i = 0; i < stList.size(); i++) // loop through students
			{
				if(numAns > 1) // multi ans
				{
					for(int j = 0; j < numAns; j++) // loop through ans
						if(stList.get(i).getMA()[j] == ans[k])  // compare stu ans to pos ans
							res[k] ++;
				}
				else // single ans
					if(stList.get(i).getSA() == ans[k]) // compare stu ans to pos ans
						res[k] ++;
			}
		}		
            
		return res;
	}
	
	public String getRes() {
		String s = "Results:";
		int[] stats = calcResult();
		for(int i = 0; i < pA.size(); i++)
			s += "\n" + pA.get(i) + ": " + stats[i];
		return s;
	}
}
