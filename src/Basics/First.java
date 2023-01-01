package Basics;

public class First {

	static void addition()     //static method
	{
		int a=65;
		int b=58;
		int r=a+b;
		System.out.println("sum is " + r);
	}
	void subtraction()
	{
		int x=56;
		int y=89;
		int z=x-y;
		System.out.println("sub is" +z);
	}
	
 public static void main(String[] args) {
		First.addition();// call static method
		
		First OBS=new First();  //CALL non-static method
		OBS.subtraction();
		First.addition();
		
		

	}

}
