package Strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class PrintDuplicateCharInStr {



	public static void main(String[] args) {
		findDuplicates();
	}

	private static void findDuplicates() {
		String name ="Nanda nithin is a good";
		char[] nameArr = name.toLowerCase().toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < nameArr.length; i++) {
			for (int j = i+1; j < nameArr.length; j++) {
				if(nameArr[i]==nameArr[j] && nameArr[i]!=' ') {
					if(map.containsKey(nameArr[i])) {
						map.put(nameArr[i], map.get(nameArr[i])+1);
					}
					else
						map.put(nameArr[i], 1);
				}
			}
		}

		System.out.println("Original i/p "+name);
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Character, Integer> entry = (Entry<Character, Integer>) itr.next();
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + " Repeated "+entry.getValue()+" times.");
			}
		}
	}

	
	////5th largest number 
	
}
