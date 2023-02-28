package day16_nestedLoop;

public class FequencyOfWord {
    public static void main(String[] args) {
        String str= "java JAVA jAvA JAva";
        String word = "Java";
        str = str. toLowerCase();
        word= word.toLowerCase();
        int count =0;

        while( str.contains(word)) { //as long as this condition is true
            count++;
            str.replaceFirst("Java", ""); //
        } //while loop only stops when there is no more Java
        System.out.println(count);

    }
}
/*
Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4
 */
