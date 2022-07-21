import java.util.Arrays;

// Java Program to find kth element
// from two sorted arrays

class KthElement
{
	static int kth(int arr1[], int arr2[], int m, int n, int k)
	{
		int i=0,j=0;
		int k1=0;
		int[] res= new int[m+n];
		while(i<m&&j<n) {
			if(arr1[i]<arr2[j]) {
				res[k1]=arr1[i];
				i++;
				k1++;
			}
			else {
				res[k1]=arr2[j];
				k1++;
				j++;
			}
		}
		while(i<m) {
			res[k1]=arr1[i];
			i++;
			k1++;
		}
		while(j<n) {
			res[k1]=arr2[j];
			k1++;
			j++;
		}
		System.out.println(Arrays.toString(res));
		return res[k-1];
	}
	
	// Driver Code
	public static void main (String[] args)
	{
		int arr1[] = {2, 3, 6, 7, 9};
		int arr2[] = {1, 4, 8, 10};
		int k = 5;
		System.out.print(kth(arr1, arr2, 5, 4, k));
	}
}
