class remove_ocurrence{
	public static void main(String[] args) {
		removeCharfromString("JeonJungkook",'o');
		removeCharfromString("KimTaehyung",'h');
		removeCharfromString("ParkJimin",'i');
	}

	private static void removeCharfromString(String input, char c){
		String result = input.replaceAll(String.valueOf(c),"");
		System.out.println(result);
	}
}