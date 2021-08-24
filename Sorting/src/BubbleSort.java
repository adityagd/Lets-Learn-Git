import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<n - 1;i++)
		{
			boolean swapped = false;
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j+1] < arr[j])
				{	
					swapped = true;
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
			if(!swapped)
			{
				break;
			}
		}
		System.out.println("Sorted array is: ");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}

}
