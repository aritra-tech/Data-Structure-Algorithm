package Algorithm.Dynamic_Programing.House_Robbers;

public class house_robbers {
    public static void main(String[] args) {
        int[] data = {2,7,9,3,1};
        System.out.println(rob(data));
    }
    public static int rob(int[] num) {
        int rob = 0; //max monney can get if rob current house
        int notrob = 0; //max money can get if not rob current house
        for(int i=0; i<num.length; i++) {
            int currob = notrob + num[i]; //if rob current value, previous house must not be robbed
            notrob = Math.max(notrob, rob); //if not rob ith house, take the max value of robbed (i-1)th house and not rob (i-1)th house
            rob = currob;
        }
        return Math.max(rob, notrob);
    }

}
