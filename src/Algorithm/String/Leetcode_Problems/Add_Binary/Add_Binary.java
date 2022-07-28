package Algorithm.String.Leetcode_Problems.Add_Binary;

public class Add_Binary {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder builder = new StringBuilder();

        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        while (aIndex >= 0 || bIndex >= 0) {
            int sum = carry;
            if (aIndex >= 0) {
                sum += (a.charAt(aIndex) - '0');
                aIndex--;
            }
            if (bIndex >= 0) {
                sum += (b.charAt(bIndex) - '0');
                bIndex--;
            }

            builder.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) {
            builder.append(carry);
        }

        return builder.reverse().toString();
    }
}
