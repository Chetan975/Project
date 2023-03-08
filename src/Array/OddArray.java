package Array;

public class OddArray {

	public static void main(String[] args) {
		
		int [] a= {2,3,5,7,8,9};
		
		for(int i=0 ;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.println(a[i]);
			}
		}

	}

}
