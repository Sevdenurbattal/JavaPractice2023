package utilities;

public class StringUtility {
    public static String reverse(String str) {
        String reverse = ""; //to contain all the characters of the given string in reversed order
        for (int i = str.length() - 1; i >= 0; i--) { //to get index number of string, starting from last index to index 0
            reverse += str.charAt(i); //gets each of the character and adds it to reverse
        }
        System.out.println(reverse);
        return reverse;
    }
}
