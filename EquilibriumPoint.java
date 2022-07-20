import java.util.Arrays;

// Java program to find an element
// such that sum of right side element
// is equal to sum of left side
public class EquilibriumPoint {
	
	// Finds an element in an array such that
	// left and right side sums are equal
	static int findElement(int arr[], int n)
	{	
		int prefix[] = new int[n];
		int suffix[] = new int[n];
		prefix[0]= arr[0];
		suffix[n-1]=arr[n-1];
		for(int i=1;i<n;i++) {
			prefix[i]=prefix[i-1]+arr[i];
		}
		for(int i=n-2;i>=0;i--) {
			suffix[i]=suffix[i+1]+arr[i];
		}
		System.out.println(Arrays.toString(prefix));
		System.out.println(Arrays.toString(suffix));
		for(int i=1;i<n;i++) {
			if(prefix[i]==suffix[i])
				return arr[i];
		}
		return -1;
		
	}
	
	// Driver code
	public static void main(String args[])
	{
		int arr[] = { 1, 4, 2, 5 };
		int n = arr.length;
		System.out.println(findElement(arr, n));
	}
}
// This code is contributed by Sumit Ghosh
