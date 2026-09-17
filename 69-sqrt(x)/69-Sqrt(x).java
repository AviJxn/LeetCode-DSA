class Solution {
    public int mySqrt(int x) {
        int start =0;
        int end=x;
        int mid=-1;

        while(start<=end){
            mid=start+(end-start)/2;
            if((long)mid*mid<x){
                start=mid+1;
            }
            else if((long)mid*mid>x){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return Math.round(end);
    }
}