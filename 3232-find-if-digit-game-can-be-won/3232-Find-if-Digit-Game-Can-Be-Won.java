class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int sum=0;
        int sum1=0;
        for(int x: nums){
            if(x<10 && x>0){
                sum+=x;
            }else if(x<100 && x>=10){
                sum1+=x;
            }
        }
        if(sum==sum1){
            return false;
        }
        else return true;
    }
}