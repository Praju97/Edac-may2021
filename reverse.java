import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		int a[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements: ");
		
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array: ");
		for(int i=3;i>=0;i--)
		{
			System.out.print(a[i]+ " ");
		}
		
	}
}