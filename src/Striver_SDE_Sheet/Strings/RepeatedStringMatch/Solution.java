package Striver_SDE_Sheet.Strings.RepeatedStringMatch;

public  Solution{
    public static void main(String[] args){
        String a="abcd";
        String b="cdabcdab";

        int ans=repeatedStringMatch(a, b);
        System.out.println(ans);
    }

    public static int repeatedStringMatch(String a, String b) {
  
        int repeat =0;
        StringBuilder str = new StringBuilder();
        
        //this loop will run untill the length of a > b
        while(str.length()<b.length()){
            str.append(a);
            repeat++;
        }
        
        if(str.indexOf(b)==-1){
            str.append(a);
            repeat++;
        }
        
        if(str.indexOf(b)==-1){
            return -1;
        }
        
        return repeat;
    }
    }
}