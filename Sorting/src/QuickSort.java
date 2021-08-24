import java.util.*;	
public class QuickSort {

	public static void quickSort(int a[],int lo,int hi)
	{
		if(lo  < hi)
		{
			int pivot = a[hi];
			int pi = partition(a,pivot,lo,hi);
			quickSort(a,lo,pi-1);
			quickSort(a,pi+1,hi);
		}
	}
	
	public static int partition(int a[],int pivot,int lo,int hi)
	{
		int i = lo;
		int j = lo;
		while(i < a.length)
		{
			if(a[i] <= pivot)
			{
				swap(a,i,j);
				i++;
				j++;
			}
			else
			{
				i++;
			}
		}
		return j-1;
	}
	public static void swap(int a[],int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	static void printArray(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+ " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		quickSort(a, 0,a.length - 1);
		System.out.println("Sorted array is: ");
		printArray(a,n);
	}

}
