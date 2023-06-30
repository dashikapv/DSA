class Multiply_Matrice{
	public static void main(String[] args) {
		//create 2 matrice
		int a [][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{1,2,3},{4,5,6},{7,8,9}};

		//create matrice to store product of 2 matrice
		int c[][]=new int[3][3];

		//multiply and print
		for(int i =0;i<3;i++){
			for (int j=0;j<3 ;j++ ) {
				c[i][j]=0;
				for(int k =0;k<3;k++){

					c[i][j] += a[i][k]*b[k][j];
				}

				System.out.print(c[i][j] + " ");
				}

				System.out.println();
				
			}
		}
	}
