class Binary_Search{

	int binarySearch(int arrs[],int l, int r, int key)
	{
		if( r>=l){
			int mid = l+(r-l)/2;
			if(arrs[mid]==key)
				return mid;
			if(arrs[mid]>key)
				return binarySearch(arrs,l,mid-1,key);
			return binarySearch(arrs,mid+1,r,key);
		}

		return -1;
	}

	public static void main(String[] args) {
		Binary_Search obj = new Binary_Search();

		int arrs[] = { 12,34,567,8,5,3,23,64,3};
		int length = arrs.length;
		int key = 5;

		int result = obj.binarySearch(arrs,0,length-1,key);
		if(result==-1)
			System.out.println("Key not present ");
		else
			System.out.println("Key found at index " + result);
	}
}