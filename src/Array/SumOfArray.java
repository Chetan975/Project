package Array;

public class SumOfArray {

	public static void main(String[] args) {
		
		int [] a= {12,34,56,78,98,56,45,67};
		
		int sum=0;
		
		for(int i=0; i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);

	}

}
