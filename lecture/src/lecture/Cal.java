package lecture;

import java.util.Scanner;

public class Cal {
	public static void main(String[] args) {
		Scanner buckey=new Scanner(System.in);
		int fnum,snum,answer;
		System.out.println("Enter first num: ");
		fnum=buckey.nextInt();
		System.out.println("Enter second num: ");
		snum=buckey.nextInt();
		answer= fnum+snum;
		System.out.println(answer);
	}
	
			
}
