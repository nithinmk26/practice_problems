package Strings;

public class Gouthami {
	public static void main(String args[]) {
        String str = "Tushar gowder";
        System.out.println(str);
        str = convertUppertoLower(str);
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count[(int) str.charAt(i)]++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[(int) str.charAt(i)] == 1) {
                System.out.print(str.charAt(i));
            }
        }

 

    }

 

    private static String convertUppertoLower(String stringName) {
        String result = "";
        char character = ' ';
        for (int i = 0; i < stringName.length(); i++) {
            if (stringName.charAt(i) >= 'A' && stringName.charAt(i) <= 'Z') {
                character = (char) (stringName.charAt(i) + 32);
            } else {
                character = (char) (stringName.charAt(i));
            }
            result = result + character;
        }
        return result;
    }
}
