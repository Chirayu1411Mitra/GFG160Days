import java.util.ArrayList;
import java.util.List;

public class KMP_algorithm {
    static ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> li = new ArrayList<>();
        int a= txt.length();
        int b=pat.length();
        for(int i=0;i<=a-b;i++){
            if(txt.substring(i,i+b).equals(pat)){
                li.add(i);
            }
        }
        return li;
    }

    public static void main(String[] args) {
        String s1="abcab";
        String s2="ab";
        ArrayList<Integer> result=new ArrayList<>();
        result=search(s2,s1);
        System.out.println(result);
    }
}