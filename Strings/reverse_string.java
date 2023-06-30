class reverse_string{
	public static void main(String[] args) {
		reverseInputString("BTS");
		reverseInputString("%^&*");
	}

	private static void reverseInputString(String input){
		StringBuilder sb = new StringBuilder(input);
		String result = sb.reverse().toString();
		System.out.println(result);
	}
}