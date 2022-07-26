import java.util.*;

public class Converting {
    public static void octal(String s){
        if(s.length()%3 == 1){
            s = "00" + s;
        }

        else if(s.length()%3 == 2){
            s = "0" + s;
        }

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("000", 0);
        hm.put("001", 1);
        hm.put("010", 2);
        hm.put("011", 3);
        hm.put("100", 4);
        hm.put("101", 5);
        hm.put("110", 6);
        hm.put("111", 7);

        String[] part = new String[3];
        int t = 0;

        for (int i = 0; i < s.length(); i+=3) {
            String bypart = s.substring(i, i+3);
            part[t] = bypart;

            if(hm.containsKey(part[t])){
                System.out.print(hm.get(part[t]));
            }

            t++;
        }
    }


    public static void main(String[] args) {
        System.out.print("Enter the Binary Number to be Converted: ");

        String s = "011";

        octal(s);

        System.out.print("Octal Equivalent is: ");


    }
}
