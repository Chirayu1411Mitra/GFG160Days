public class Non_repeating_char {
    static char Non_repeating(String s){
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            boolean Nonrepeating= true;
            for(int j=0;j<c.length;j++){
                if(i!=j && c[i]==c[j]){
                    Nonrepeating=false;
                    break;
                }
                }
            if(Nonrepeating){
                return c[i];
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String s="geeksforgeeks";
        char c=Non_repeating(s);
        System.out.println(c);
    }
}
