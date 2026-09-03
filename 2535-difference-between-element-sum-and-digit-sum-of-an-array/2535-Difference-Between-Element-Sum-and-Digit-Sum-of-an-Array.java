class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,sum1=0;
        
        for(int num:nums){
            sum+=num;
            while(num>0){
                sum1+=num%10;
                num/=10;
            }
        }
        return Math.abs(sum-sum1);
    }
}