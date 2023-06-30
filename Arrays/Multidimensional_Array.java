class Multidimensional_Array{
	public static void main(String[] args) {
		
		// declare and initialize 2d array
		int array[][]={{1,2,3},{4,5,6},{7,8,9}};

		//print 2d array
		for(int i =0;i<3;i++){
			for (int j=0;j<3 ;j++ ) {
				System.out.print(array[i][j]+ "");
				
			}

			System.out.println();
		}
	}
}