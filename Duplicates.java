import java.util.Scanner;
public class Duplicates {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Elements:-");
		int n = sc.nextInt();
		
		int arr[] =  new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int max = -10000;
		
		for(int i=0; i<n; i++)
		{
			if(max < arr[i])
				max = arr[i];
		}
		
		int temp[] = new int[max+1];
		for(int i=0; i<(max+1); i++)
		{
			temp[i] = 0;
		}
		
		for(int i=0; i<n; i++)
		{
			temp[arr[i]]++;
		}
		
		
		System.out.println("\nDuplicate Nummbers:-\t");
		for(int i=0; i<max+1; i++)
		{
			if(2 <= temp[i])
			{
				System.out.print(i+" ");
			}
		}
		
		
	}
}
