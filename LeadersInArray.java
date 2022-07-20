class LeadersInArray
{
	/*Java Function to print leaders in an array */
	void printLeaders(int arr[], int size)
	{
		int max=0;
		int n= arr.length;
		for(int j=n-1;j>=0;j--) {
			if(max<arr[j]) {
				max=arr[j];
				System.out.println(max);
			}
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args)
	{
		LeadersInArray lead = new LeadersInArray();
		int arr[] = new int[]{19, 17, 4, 3, 5, 2};
		int n = arr.length;
		lead.printLeaders(arr, n);
	}
}
