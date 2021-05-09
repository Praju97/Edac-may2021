import java.util.*;

class oddeven
{
	public static void main(String args[])
	{
		int num;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number: ");
		num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.print("The Given number is EVEN");
		}
		else
		{
			System.out.print("The Given number is ODD");
		}
	}
}