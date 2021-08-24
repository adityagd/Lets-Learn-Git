import java.util.*;
public class MergeSort {
	
	public static int[] mergeSort(int a[], int lo,int hi)
	{
		if(lo == hi)
		{
			int b[] = new int[1];
			b[0] = a[lo];
			return b;
		}
	
		int mid = (lo +  hi) / 2;
	    int [] fsh = mergeSort(a,lo,mid);
	    int [] ssh = mergeSort(a,mid+1,hi);
	    int [] fsa = sortedArrays(fsh, ssh);
	    return fsa;
	}

	public static int[] sortedArrays(int a[],int b[])
	{
		int i=0,j=0,k=0;
		int res[] = new int[a.length + b.length];
		while(i<a.length && j<b.length)
		{
			if(a[i] < b[j])
			{
				res[k] = a[i];
				i++;
				k++;
			}
			else
			{
				res[k] = b[j];
				j++;
				k++;
			}
		}
		while(i<a.length)
		{
			res[k] = a[i];
			i++;
			k++;
		}
		while(j<b.length)
		{
			res[k] = b[j];
			j++;
			k++;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		n = sc.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int res[] = mergeSort(a,0,n-1);
		for(i=0;i<n;i++)
		{
			System.out.println(res[i]+ " ");
		}
	}

}
