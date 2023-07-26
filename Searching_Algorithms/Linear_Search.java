// Java program to implement Linear Search

class Linear_Search {

	// Function for linear search
	public static int search(int arrs[], int key)
	{
		int n = arrs.length;

		// Traverse array arrs[]
		for (int i = 0; i < n; i++) {

			// If element found then return that index
			if (arrs[i] == key)
				return i;
		}
		return -1;
	}

	// Driver Code
	public static void main(String args[])
	{
		// Given arrs[]
		int arrs[] = { 25, 34, 43, 10, 40 };

		// Element to search
		int key = 25;

		// Function Call
		int result = search(arrs, key);
		if (result == -1)
			System.out.print(
				"Key is not present in array");
		else
			System.out.print("Key is present at index " + result);
							
	}
}
