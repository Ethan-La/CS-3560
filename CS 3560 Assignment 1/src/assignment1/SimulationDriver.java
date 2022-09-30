package assignment1;
import java.util.Random;

public class SimulationDriver {
	public static void main (String[]args) {
		// creating students & setting ID
		Student s1 = new Student();
		s1.setID("Abe");
		Student s2 = new Student();
		s2.setID("Bob");
		Student s3 = new Student();
		s3.setID("Cat");
		Student s4 = new Student();
		s4.setID("Dud");
		Student s5 = new Student();
		s5.setID("Eve");
		Student s6 = new Student();
		s6.setID("Fay");
		Student s7 = new Student();
		s7.setID("Gru");
		Student s8 = new Student();
		s8.setID("Hui");
		Student s9 = new Student();
		s9.setID("Jay");
		Student s10 = new Student();
		s10.setID("Kai");
		Student s11 = new Student();
		s11.setID("Lea");
		Student s12 = new Student();
		s12.setID("Mia");
		Student s13 = new Student();
		s13.setID("Ned");
		Student s14 = new Student();
		s14.setID("Oli");
		Student s15 = new Student();
		s15.setID("Poh");
		Student s16 = new Student();
		s16.setID("Ray");
		Student s17 = new Student();
		s17.setID("Sam");
		Student s18 = new Student();
		s18.setID("Tom");
		Student s19 = new Student();
		s19.setID("Vox");
		Student s20 = new Student();
		s20.setID("Zac");
		
		// placing students into list
		Student[] stus = new Student[20];
		stus[0] = s1;
		stus[1] = s2;
		stus[2] = s3;
		stus[3] = s4;
		stus[4] = s5;
		stus[5] = s6;
		stus[6] = s7;
		stus[7] = s8;
		stus[8] = s9;
		stus[9] = s10;
		stus[10] = s11;
		stus[11] = s12;
		stus[12] = s13;
		stus[13] = s14;
		stus[14] = s15;
		stus[15] = s16;
		stus[16] = s17;
		stus[17] = s18;
		stus[18] = s19;
		stus[19] = s20;
		
		// create question w 1 ans
		SingleAnsQ q1 = new SingleAnsQ();
		q1.setQ("Which of the first 7 letters is your favorite?");
		char[] q1a = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		q1.setPosAns(q1a);
		q1.setActAns('e');
		
		// generate rand ans
		s1.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s2.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s3.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s4.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s5.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s6.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s7.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s8.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s9.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s10.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s11.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s12.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s13.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s14.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s15.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s16.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s17.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s18.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s19.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		s20.setSA((char)(new Random().nextInt(103 - 97 + 1) + 97));
		
		// create Voting Service &  displaying
		VotingService iVote1 = new VotingService();
		iVote1.setStList(stus);
		iVote1.setQuestion(q1);
		System.out.println(q1.getQ());
		System.out.println(iVote1.getRes());
		
		System.out.println("");
		
		// create question w mult ans
		MultiAnsQ q2 = new MultiAnsQ();
		q2.setQ("Which of the 7 letters are vowels?");
		char[] q2pA = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		q2.setPosAns(q2pA);
		char[] q2aA = {'a', 'e'};
		q2.setActAns(q2aA);
		
		// generate rand ans
		char[] c1 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s1.setMA(c1);
		char[] c2 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s2.setMA(c2);
		char[] c3 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s3.setMA(c3);
		char[] c4 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s4.setMA(c4);
		char[] c5 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s5.setMA(c5);
		char[] c6 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s6.setMA(c6);
		char[] c7 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s7.setMA(c7);
		char[] c8 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s8.setMA(c8);
		char[] c9 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s9.setMA(c9);
		char[] c10 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s10.setMA(c10);
		char[] c11 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s11.setMA(c11);
		char[] c12 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s12.setMA(c12);
		char[] c13 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s13.setMA(c13);
		char[] c14 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s14.setMA(c14);
		char[] c15 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s15.setMA(c15);
		char[] c16 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s16.setMA(c16);
		char[] c17 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s17.setMA(c17);
		char[] c18 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s18.setMA(c18);
		char[] c19 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s19.setMA(c19);
		char[] c20 = {(char)(new Random().nextInt(100 - 97 + 1) + 97),
				(char)(new Random().nextInt(103 - 101 + 1) + 101)};
		s20.setMA(c20);
		
		// create Voting Service &  displaying
		VotingService iVote2 = new VotingService();
		iVote2.setStList(stus);
		iVote2.setQuestion(q2);
		System.out.println(q2.getQ());
		System.out.println(iVote2.getRes());
	}
}
