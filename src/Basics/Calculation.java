package Basics;

public class Calculation {

	
	int add()     // non static method
	{
		int a=65;
		int b=89;
		int res= a+b;
		return res;  
		
	}
	void sub()
	{
		int x=58;
		int y=65;
		int res=x-y;
		System.out.println("sub is "+ res);
		
	}
	
	double div()
	{
		double h=89;
		double o=98;
		double res=h/o;
		return res;
	}
	
	public static void main(String[] args) {
		
		Calculation cal=new Calculation();
		int addition = cal.add();
	    System.out.println(addition);
	    
	    cal.sub();
	    
	    double vvv = cal.div();
	    System.out.println(vvv);

	}

}
