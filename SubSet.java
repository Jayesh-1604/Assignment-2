import java.util.Scanner;

public class SubSet {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Elements of arr1:-");
		int n = sc.nextInt();
		
		int arr1[] =  new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		
		System.out.print("Enter Total Elements of arr2:-");
		int m = sc.nextInt();
		
		int arr2[] =  new int[m];
		
		for(int i=0; i<m; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		
		if(m >= n)
		{
			System.out.println("Arr2 is not subset of Arr1");
		}
		else
		{
			int count = 0;
			for(int i=0; i<m; i++)
			{
				for(int j=0; j<n; j++)
				{
					if(arr2[i] == arr1[j])
						count++;
				}
			}
			
			if(count == m)
				System.out.println("Arr2 is subset of Arr1");
			else
				System.out.println("Arr2 is not subset of Arr1");
		}
	}
}
