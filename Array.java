package poblem_solving;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		int array[] = new int[10];
		Scanner sc = new Scanner(System.in);		//Array initialzation--int array[]=new int [] {5,1,2,3,4};
		for(int i=0; i<10; i++)
		{
			array[i]=i;
		}
		
		int i;
		
		System.out.print("Enter the value to check in array = ");
		int num=sc.nextInt();
		for(i=0; i<10; i++)
		{
			int temp=array[i];
			if(temp==num)
			{
				System.out.println("Value is present in array");
				break;
			}			
					
		}
		if(i==10)
		{
			System.out.println("Value is not present in array");
		}
		
	}

}
