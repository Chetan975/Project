package Practice;

public class ParaNonPara {
	
	double div(double x,double y)
	{
		double a=x;
		double b=y;
		double res=a/b;
		return res;
	}

	
public static void main(String[] args) {
	ParaNonPara iron=new ParaNonPara();
	double captain = iron.div(56.58, 78.36);
     double cap = iron.div(58, 78);
     System.out.println(cap);
     double io = iron.div(45, 456);
     System.out.println(io);
	
	
	
	System.out.println(captain);

	}

}
