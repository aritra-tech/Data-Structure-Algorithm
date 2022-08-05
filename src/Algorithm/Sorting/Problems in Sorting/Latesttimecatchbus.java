import java.util.*;

public class Latesttimecatchbus {
    static int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        
        Arrays.sort(passengers);
        Arrays.sort(buses);
         SortedSet<Integer> set = new TreeSet<Integer>();
        int j = 0;
        int count = 0;
        int last = 0;
        
        for(int i = 0; i < buses.length; i++){
            count = 0;
            while(count<capacity && j <= passengers.length-1 && passengers[j] <= buses[i]){
                set.add(passengers[j]);
                last = passengers[j];
                j++;
                count++;
            }
            if(i == buses.length-1){
                if(count<capacity && last < buses[i])
                    return buses[buses.length-1];
            }
        }
        //System.out.println(set);
        Integer[] s = new Integer[set.size()];
        s = set.toArray(s);
        if(set.size() == 0)
            return buses[buses.length-1];
        if(set.size() == 1)
            return set.last()-1;
        

        for(int i = s.length-1; i >0; i--){
            if(s[i] - s[i-1] > 1)
                return s[i]-1;
        }
        
        
        return s[0]-1;
        
        
    }

    public static void main(String[] args) {
        int[] b = {10,20};
        int[] p = {2,17,18,19};
        int c = 2;
        System.out.println(latestTimeCatchTheBus(b, p, c));
    }

}
