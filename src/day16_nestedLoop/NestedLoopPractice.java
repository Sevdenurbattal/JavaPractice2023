package day16_nestedLoop;

public class NestedLoopPractice {

    public static void main(String[] args) {
        String str = "aaabbccccddeeeeeff";
        String result = ""; //bdf

        for(int j= 0; j<str.length(); j++) {

            char ch = str.charAt(j); //each character of str
            int count = 0;
            for (int i = 0; i < str.length(); i++) { //responsible for comparing ch to each characters of str and return frequency of ch
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            if (count == 2 && !result.contains(""+ch)) { //if frequency equals twice and character is not contained in result yet
                result += ch;
            }
        }
        System.out.println(result);
    }
}


/*
return characters that appeared twice, and frequencey of every single character
 */