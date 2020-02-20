import java.io.PrintWriter;

public class CostEstimator {
	
	protected String materialStandard;
	protected int totalArea;
	protected boolean fullyAutomated;

	public CostEstimator(String materialStandard, int totalArea, boolean fullyAutomated)
	{
		this.fullyAutomated = fullyAutomated;
		this.materialStandard = materialStandard;
		this.totalArea = totalArea;
	}
	public void calculateCost()
	{
		PrintWriter writer = new PrintWriter(System.out);
		String s = "";
		int costperfeet = 0;
		if (this.materialStandard.equals("standard materials") && this.fullyAutomated == false)
			costperfeet = 1200;
		else if (this.materialStandard.equals("above standard materials") && this.fullyAutomated == false)
			costperfeet = 1500;
		else if(this.materialStandard.equals("high standard materials") && this.fullyAutomated == false)
			costperfeet = 1800;
		else if (this.materialStandard.equals("high standard materials") && this.fullyAutomated == true)
			costperfeet = 2500;
		
		int totalCost = costperfeet * this.totalArea;
		s = "Total Cost of Construction is :- ";
		writer.printf("%s" + totalCost, s);
		writer.flush();
	}
}
