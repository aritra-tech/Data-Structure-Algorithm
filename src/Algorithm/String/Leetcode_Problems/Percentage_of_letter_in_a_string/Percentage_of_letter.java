package Algorithm.String.Leetcode_Problems.Percentage_of_letter_in_a_string;

    public class Percentage_of_letter {
        public int percentageLetter(String s, char letter) {
            double count=0,tot=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==letter)
                    count++;
                tot++;
            }
        return (int)((count/tot)*100);
    }
}