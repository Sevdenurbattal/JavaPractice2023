package day15_WhileLoop;

public class RemoveDupes2 {
    public static void main(String[] args) {
        String str= "xyzxyzxyz";
        String result ="";

        for (int i=0; i<str.length(); i++){
            if(result.contains(""+str.charAt(i)) ) {
                continue;//skip it

            }
            result +=str.charAt(i);

        }
        System.out.println(result);
    }
}
