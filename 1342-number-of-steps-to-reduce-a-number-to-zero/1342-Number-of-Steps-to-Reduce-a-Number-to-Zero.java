class Solution {
    public int numberOfSteps(int num) {
        int step=0;
        int div=0;
        while(num>0){
            if(num%2==0){
                div=num/=2;
            }
            else{
                num-=1;;
            }
            step++;
        }
        return step;
    }
}