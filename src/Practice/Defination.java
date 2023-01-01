package Practice;

public class Defination {
	
	static void addition()
	{
		int a=45;
		int b=98;
		System.out.println(a+b);
	}
	
	void Sub()
	{
		int a=98;
		int b=99;
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		
		Defination obj=new Defination ();
		obj.Sub();
		Defination.addition();
		
		

	}

}
