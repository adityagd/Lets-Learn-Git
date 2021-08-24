import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,n;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		n = sc.nextInt();
		System.out.println("Enter the elements of the array: ");
		int a[] = new int[n];
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		for(i=1;i<n;i++)
		{
			int temp = a[i];
			int j = i - 1;
			while(j>=0 && a[j] > temp)
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+ " ");
		}
	}

}
