package maven_SimpleInterest_CI_demo;
import java.util.*;
import java.io.*;
public class TestInterest {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		PrintWriter writer = new PrintWriter(System.out);
		String s ="Enter the principal amount :- ";
		writer.printf("%s", s);
		writer.flush();
		double principal = sc.nextDouble();
		s="Enter the rate of interest  :- ";
		writer.printf("%s", s);
		writer.flush();
		float rate = sc.nextFloat();
		s= "Enter the time period  :- ";
		writer.printf("%s", s);
		writer.flush();
		int time = sc.nextInt();
		
		SimpleInterest si = new SimpleInterest(principal,rate,time);
		si.calcInterest();
		
		CompoundInterest ci = new CompoundInterest(principal, rate, time);
		ci.calcInterest();
	}

}
