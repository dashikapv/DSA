class Copy_Array {
	public static void main(String[] args) {
		//declare source array

		char[] copyFrom = {'d','a','s','h','i','k','a','j','k'};

		//declare a destination array
		char[] copyTo = new char[7];

		//copying array using System.arraycopy() method
		System.arraycopy(copyFrom,2,copyTo,0,7);

		//printing destination array
		System.out.println(String.valueOf(copyTo));

	}

}
	
