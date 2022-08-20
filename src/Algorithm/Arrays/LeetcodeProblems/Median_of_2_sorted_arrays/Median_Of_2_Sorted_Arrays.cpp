#include<iostream>
/* VECTOR LIBRARAY*/
#include<vector>
/* INT_MAX & INT_MIN */  
#include<climits>
using namespace std;


double mediann(vector<int>&a,vector<int>&b){
    /* SIZE OF ARRAY-1 */
    int  m = a.size();
    /* SIZE OF ARRAY-2 */
    int n = b.size();
    /* WE APPLY BINARY SEARCH ON ARRAY OF LESS SIZE TO MINIMIZE THE TIME */ 
    if(m > n)
        return mediann(b,a);
    /* LEFT & RIGHT END OF THE ARRAY */
    int l = 0,r = m;
    while(l <= r){
        /* DIVIDING INTO LEFT SECTION*/
        int partx = l + (r - l)/2;
        /* DIVING INTO RIGHT SECTION */
        int party=(m+n+1)/2 - partx;
        /* SO HERE IN THIS QUESTION ARRAYS ARE SORTED
            SO WE CAN USE THIS AS A CONDITION MAXIMUM OF THE ARRAYS
            WILL ON RIGHT SIDE & MINIMUM ON THE LEFT SIDE & 
            BUT IN CASE OF CORNER CASE WHICH IS THE LAST
            OR FIRST ELEMENT. IN CASE OF FIRST ELEMENT ITS
            INT_MIN AND IN CASE OF LAST ELEMENT ITS INT_MAX TO CO
            MAPRE WITH */ 
        int maxlx = (partx == 0)? INT_MIN : a[partx-1];
        int minrx = (partx == m)? INT_MAX :  a[partx];
        int maxly = (party == 0)? INT_MIN :  b[party-1];
        int minry = (party==n)?INT_MAX:b[party];
        /* SO IF FIND THE MINIMUM AND MAXIMUM NUMBER
        IN BOTH THE HALVES THEN RETURN THE 
        SUM OF MAXIMUM(OF LEFT & RIGHT PORTION) &
        MINIMUM(OF LEFT & RIGHT) / 2 WHICH IS THE MEDIAN OF 
        THE 2 ARRAYS */ 
        if(maxlx <= minry && maxly <= minrx){
            if((m + n) % 2 == 0)
                return (double)(max (maxlx , maxly)+ min(minrx , minry)) / 2;
            else
                return (double)(max(maxlx,maxly));
        /* WE HAVE TO MOVE TO CENTER OF THE ARRAYS FOR GETTING THE MEDIAN */        
        }else if(maxlx > minry)
            r = partx - 1;
        else
            l= partx + 1;
    }
    return -1.0;
}
double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
    double ans;
    /* CALLING THE FUNCTION FOR GETTING THE MEDIAN */
    ans = mediann(nums1,nums2);
    return ans;   
}
int main(){
    vector <int> nums1{1,3};
    vector <int> nums2{2};
    double ans = findMedianSortedArrays(nums1,nums2);
    printf("%lf is the median of the arrays",ans);
}