// to demonstrate how to declare, instantiate, initialize and traverse the array

class Arrays{
	public static void main(String[] args) {

		// declaration and instantiation
		//int array[] = new int[5];

		// alternate and easy way

		int arrays[] = {10,20,30,40,50,40,30,20};

		//initialization
		// array[0] = 10;
		// array[1] = 20;
		// array[2] = 30;
		// array[3] = 40;
		// array[4] = 50;
		//array[5] = 60;// throws indexoutofbound exception

		//traversing array
		//for(int i = 0;i<arrays.length;i++)
			// length is property of array

		// using for each loop
		for(int i : arrays)
		System.out.println(i);
	}
}