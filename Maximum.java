import java.util.*;
class Maximum
{
	public static void main(String args[])
	{
		int a[]=new int[3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter elements in an array: ");
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int max=a[0];
		for(int i=0;i<3;i++)
		{
			
			if(max < a[i])
			{
				max = a[i] ;
			}
			
		}	
		
			System.out.println(max);
		
	}
}