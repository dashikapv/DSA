class Ternary_Search{
	static int ternarySearch(int l, int r, int key,int ar[])
	{
		if(r>=l){
			int mid1 = l+(r-l)/3;
			int mid2 = r-(r-l)/3;

			if(ar[mid1] == key){
				return mid1;
			}
			if(ar[mid2]==key){
				return mid2;
			}

			if(key<ar[mid1]){
				return ternarySearch(l,mid1-1,key,ar);
			}
			else if(key>ar[mid2]){
				return ternarySearch(mid2+1,r,key,ar);
			}
			else{
				return ternarySearch(mid1+1,mid2-1,key,ar);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int l,r,p,key;
		int ar[] = {12,34,657,765,45,4,3,2,3,56,76,8,8};
		l=0;
		r=4;
		key=34;
		p=ternarySearch(l,r,key,ar);
		System.out.println("Index of " + key+ "is" + p);
		key = 765;
		p=ternarySearch(l,r,key,ar);
		System.out.println("Index of" + key + "is" + p);
	}
			}
			