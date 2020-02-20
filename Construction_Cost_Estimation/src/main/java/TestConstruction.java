import java.util.*;
import java.io.*;
public class TestConstruction {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		PrintWriter writer = new PrintWriter(System.out);
		String s = "";
		s = "Enter Material Standard : - ";
		writer.printf("%s", s);
		writer.flush();
		String materialStandard = sc.next();
		s = "Enter total Area :- ";
		writer.printf("%s", s);
		writer.flush();
		int totalArea = sc.nextInt();
		s = "Do you want a fully automated home ? :- ";
		writer.printf("%s", s);
		writer.flush();
		boolean fullyAutomated = sc.hasNextBoolean();
		
		
		CostEstimator ce = new CostEstimator(materialStandard, totalArea, fullyAutomated);
		ce.calculateCost();
	}
}
