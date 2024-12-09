import java.util.Arrays;

public class Anaagram_atring {
    static boolean areAnagram(String s1,String s2){
        char[] Arrays1=s1.toCharArray();
        char[] Arrays2=s2.toCharArray();

        Arrays.sort(Arrays1);
        Arrays.sort(Arrays2);

        return Arrays.equals(Arrays1,Arrays2);
    }

    public static void main(String[] args) {
        String s1="geek";
        String s2="kjee";
            if(areAnagram(s1,s2)){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
    }
}
