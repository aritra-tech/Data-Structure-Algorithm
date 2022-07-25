package Algorithm.Searching.Leetcode_problems.Find_smallest_letter_greater_than_target;


public class greaterelement
{
	public static void main(String[] args) {
	    char[] letters={'c','f','j'};
	    char target='a';
		System.out.println(nextGreatestLetter(letters,target));
	}
	static char nextGreatestLetter(char[] letters, char target) {
        if(target>=letters[letters.length-1]){
            return letters[0];
        }
        int start=0;
        int end=letters.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(letters[mid]<=target){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return letters[start];
    }
}
