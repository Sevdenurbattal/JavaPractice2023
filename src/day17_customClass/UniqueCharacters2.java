package day17_customClass;

public class UniqueCharacters2 {

    public static void main(String[] args) {
        String str = "aabcccd";
        String unique = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) { //checks how many times ch has appeared in str
                if (str.charAt(i) == ch) {  //if ch has appeared in string
                    frequency++; //increase frequency by 1
                }
            }
            if (frequency == 1) { //if frequency is one, then it is unique
                unique += ch;
            }
        }
        System.out.println(unique);
    }
}
