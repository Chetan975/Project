package Array;

public class MaximumNumber {

	public static void main(String[] args) {
		
		int[] a= {67,89,90,99,67,54,98,87};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if (max < a [i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
		

	}

}
