class count_words_in_string{
	public static void main(String[] args) {
		countNoOfWords("Bts jk ");
		countNoOfWords("namjoon jin   jhope");
		countNoOfWords("suga jimin v");
	}

	private static void countNoOfWords(String input){
		String trimmedLine = input.trim();
		int count = trimmedLine.isEmpty() ? 0 : trimmedLine.split("\\s+").length;
		
		System.out.println(count);
	}
}