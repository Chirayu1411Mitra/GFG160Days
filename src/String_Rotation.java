public class String_Rotation {
    static  boolean rotation(String s1,String s2){
        s1 = s1+s1;
        return s1.lastIndexOf(s2)>=0;

    }

    public static void main(String[] args) {
        String s1="aab";
        String s2="aba";
        boolean equal=rotation(s1,s2);
        System.out.println(equal);
    }

}
