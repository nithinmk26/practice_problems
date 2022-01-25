package Strings;

import java.util.LinkedHashMap;

public class CountRepitativeString {

	public static void main(String[] args) {
		String name = "Nanda Nithin MK Birur";
		
		char[] nameArr = name.toLowerCase().toCharArray();
		
		int count=0;
		String repeat = "";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < nameArr.length; i++) {
			for (int j = i+1; j < nameArr.length; j++) {
				if(nameArr[i]==' ') {
					break;
				}
				else {
					if (nameArr[i]==nameArr[j]) {
						map.putIfAbsent(nameArr[i],123);
						repeat+=nameArr[i];
						break;
					}
				}
			}
		}
		if(repeat.length()>0) {
		System.out.println("Total "+count + " char repeated...!");
		System.out.println("Repeated Char are "+repeat);
		}
		else
			System.out.println("No Repeat found..!!");
	}

}
