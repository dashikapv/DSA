class Addition_Matrices{
	public static void main(String[] args) {
		//create 2 matrices
		int a[][]={{1,2,3},{4,5,6}};
		int b[][]={{1,2,3},{4,5,6}};

		//create another matrice to store sum of other 2
		int c[][]=new int[2][3];


		//add and print
		for (int i=0;i<2 ;i++ ) {
			for (int j=0;j<3 ;j++ ) {

				c[i][j]=a[i][j]+b[i][j];

				System.out.print(c[i][j]+" ");
				
			}

			System.out.println();
			
		}
	}
}