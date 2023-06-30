class palindrome{
	public static void main(String[] args) {
		
		checkPalindrome("BTB");
		checkPalindrome("BTSARMY");
		checkPalindrome("HYBE");

	}

	private static void checkPalindrome(String input){
		boolean result = true;
		int length = input.length();
		for(int i = 0; i<length/2;i++){
			if(input.charAt(i) != input.charAt(length-i-1)){
				result = false;
				break;
			}
		}

		System.out.println(input+"is palindrome = "+ result);
	}
}