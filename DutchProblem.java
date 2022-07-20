// Java implementation of the approach
import java.io.*;

class DutchProblem {
	// Utility function to print the contents of an array
	static void printArr(int arr[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
	
	// Function to sort the array of 0s, 1s and 2s
	static void sortArr(int arr[], int n)
	{
		int i, z = 0, o = 0, t = 0;
	
		// Count the number of 0s, 1s and 2s in the array
		for(i =0;i<n;i++) {
			if(arr[i]==0)
				z++;
			if(arr[i]==1)
				o++;
			if(arr[i]==2)
				t++;
			
		}
		int j =0;
		while(z>0) {
			arr[j]=0;
			j++;
			z--;
		}
		while(o>0) {
			arr[j]=1;
			j++;
			o--;
		}
		while(t>0) {
			arr[j]=2;
			j++;
			t--;
		}
	
		// Print the sorted array
		printArr(arr, n);
	}
	
	// Driver code
	public static void main(String[] args)
	{
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2 };
		int n = arr.length;
		sortArr(arr, n);
	}
}

// This code is contributed by shubhamsingh10
