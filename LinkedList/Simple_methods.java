import java.util.LinkedList;

class list_create{
	public static void main(String[] args) {
		
		// create linkedlist
		LinkedList<String> BTS = new LinkedList<>();

		//adding elements into linked list without index
		BTS.add("KIM Namjoon");
		BTS.add("KIM Seokjin");
		BTS.add("MIN Yoongi");
		BTS.add("JUNG Hoseok");
		BTS.add("PARK Jimin ");
		BTS.add("KIM Taehyung");
		BTS.add("JEON Jungkook");
		System.out.println("LinkedList: " + BTS);

		//add elements with index
		BTS.add(7, "ARMY");
		BTS.add(8, " Haters");
		System.out.println("Updated LinkedList: " + BTS);

		//get element from linked list
		String str = BTS.get(5);
		System.out.println("Element at index 5: " + str);

		//change element in list
		BTS.set(8, "ARMY Bangatn");
		System.out.println("Updated LinkedList: " + BTS);

		//remove element from list
		String s = BTS.remove(6);
		System.out.println("Removed Element: " + s);
		System.out.println("Updated LinkedList: " + BTS);
		



	}
	
}