class Solution {
    public int differenceOfSum(int[] nums) {
        int n= nums.length;
        int sum=0,sum1=0;
        
        for(int i=0;i<n;i++){
            sum+=nums[i];
            String s= String.valueOf(nums[i]);
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                sum1+=ch-'0';
         }
        }
        int k=Math.abs(sum-sum1);
        return k;
    }
}