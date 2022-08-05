public class MinSquredDiff {
    static long minSumSquareDif(int[] nums1, int[] nums2, int k1, int k2) {
        int lo=0,hi=100000,k=k1+k2;
        long extra=0,ans=0;
        while(lo<hi){
            int mid=(lo+hi)>>1;
            long need=0;
            for (int i = 0 ; i< nums1.length&&need<=k;i++){
                need += Math.max(0, Math.abs(nums1[i]-nums2[i])-mid);
            }
            if (need<=k){
                hi=mid;
                extra=k-need;
            }else{
                lo=mid+1;
            }
        }

        for (int i = 0; i< nums1.length&&lo>0;i++){// make sure to check lo (diff) > 0 here.
            long diff = Math.min(lo, Math.abs(nums1[i]-nums2[i]));
            if (diff==lo&&extra>0){ 
                --diff;
                --extra;
            }
            ans+=diff*diff;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] n1 = {1,2,3,4};
        int[] n2 = {2,10,20,19};
        int k1 = 0;
        int k2 = 0;
        System.out.println(minSumSquareDif(n1, n2, k1, k2));
    }
}
