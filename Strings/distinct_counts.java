import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class distinct_counts{
	public static void main(String[] args) {
		printdistinct_counts("bts");
		printdistinct_counts("army");
		printdistinct_counts("Hi, I am BTS Army here");

	}

	private static void printdistinct_counts(String input){
		Map<Character,Integer> charsWithCountMap = new HashMap<>();

		for(char c : input.toCharArray())
			charsWithCountMap.merge(c,1,Integer::sum);
		System.out.println(charsWithCountMap);

		List<Character> list = input.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

		list.stream().forEach(c -> charsWithCountMap.merge(c, 1, Integer::sum));

		System.out.println(charsWithCountMap);
	}
}