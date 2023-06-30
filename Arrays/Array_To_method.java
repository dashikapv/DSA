// demonstrate way of passing array to method

class Array_To_method{

	// create method which receive array as parameter
	static void minimum(int array[]){
		int minimum = array[0];
		for(int i = 1; i<array.length;i++)
			if(minimum>array[i])
				minimum = array[i];

			System.out.println(minimum);
	}

	public static void main(String[] args) {
		int arrays[] = {12,23,45,67,78,9,6,9,677,76,767,7};
		minimum(arrays);// passing array to method
	}



}