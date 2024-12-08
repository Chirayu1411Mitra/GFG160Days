public class add_binary_string {
    public static String addBinary(String s1, String s2) {
        s1 = s1.replaceFirst("^0+", "");
        s2 = s2.replaceFirst("^0+", "");

        if (s1.isEmpty() && s2.isEmpty()) {
            return "0";
        }

        int p1 = s1.length() - 1;
        int p2 = s2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (p1 >= 0 || p2 >= 0 || carry > 0) {
            int digit1 = (p1 >= 0) ? s1.charAt(p1) - '0' : 0;
            int digit2 = (p2 >= 0) ? s2.charAt(p2) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.append(sum % 2);
            carry = sum / 2;

            p1--;
            p2--;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String binary1 = "00101";
        String binary2 = "1101";

        String result = addBinary(binary1, binary2);
        System.out.println(result);
    }
}
