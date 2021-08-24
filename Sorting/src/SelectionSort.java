import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		n = sc.nextInt();
		System.out.println("Enter the elements of the array: ");
		int a[] = new int[n];
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			int min = i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j] < a[min])
				{
					min = j;
				}
			}
			if(min != i)
			{
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+ " ");
		}
	}

}
