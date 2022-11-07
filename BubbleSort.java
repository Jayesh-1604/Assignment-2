
public class BubbleSort {

	public static int[] bubbleSort(int[] arr)
	{
		
		int n = arr.length;
		
		for(int i=0; i<n-1;i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		return arr;
	}
	
	
	public static void printArray(int arr[])
	{
		int n = arr.length;
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {

		int arr[] =  { 11, 8, 1, 29, 11, 5, 2, 71, 3, 0 };
		
		arr = bubbleSort(arr);
		
		System.out.println("Sorted Array:-\n");
		printArray(arr);
	}

}
