import java.math.BigInteger;
import java.util.HashSet;

class Pangram{

    static String numberPangram(BigInteger N){
        String num = N.toString();
        char[] arrNum = num.toCharArray();
        HashSet<Character> setNum = new HashSet<Character>();

        for(char ch : arrNum){
            setNum.add(ch);
        }


        if(setNum.size() == 10){
            return "True";
        }
        else{
            return "False";
        }
    }


    public static void main(String[] args) {
        BigInteger N = new BigInteger("10239876540022");
        System.out.print(numberPangram(N));
    }
}