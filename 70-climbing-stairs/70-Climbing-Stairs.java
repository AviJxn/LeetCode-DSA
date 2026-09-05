class Solution {
    public int climbStairs(int n) {
        if(n==0 || n==1){
            return 1;
        }
        int f=1, l=1;
        for(int i=2; i<=n;i++){
            int temp =f;
            f=l+f;
            l=temp;
        }
        return f;
    }
}