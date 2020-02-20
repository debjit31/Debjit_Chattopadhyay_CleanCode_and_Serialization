package maven_SimpleInterest_CI_demo;

public class SimpleInterest {
	
	protected double principal;
	protected float rate;
	protected int time;
	public SimpleInterest(double p, float r, int t){
		this.principal = p;
		this.rate = r;
		this.time = t;
	}
	public void calcInterest()
	{
		double simpleInterest  = (this.principal * this.rate * this.time) / 100;
		System.out.println("Simple Interest is :- " + simpleInterest);
	}

}
