package Array;

public class EvenOddArray {

	public static void main(String[] args) {
	
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0;i<a.length;i++)
		{
			if (a[i]%2==0)
			{
				System.out.println("even");
				System.out.println( a[i]);
			}
			else
			{
				System.out.println("odd");
				System.out.println(a[i]);
			}
		}

	}

}
