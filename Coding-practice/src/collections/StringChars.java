package collections;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StringChars {

	public static void main(String[] args) {
		String name = "Nanda Nithin";
		Map<Character, Integer> charMap = new HashMap<>();
		
		char[] arr = name.toLowerCase().toCharArray();
		
		for (char ch : arr) {
		if(charMap.containsKey(ch)) {
			charMap.put((char)ch, charMap.get(ch)+1);
		}
		else {
			charMap.put((char)ch, 1);
		}}
	
		List<Entry<Character, Integer>> ch = charMap.entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toList());
		ch.forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
	}

}
