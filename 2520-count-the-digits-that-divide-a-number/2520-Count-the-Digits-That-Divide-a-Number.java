class Solution {
    public int countDigits(int num) {
        int num2=num;
        int rem=0, count=0;

        while(num2>0){
            rem=num2%10;
            if(num%rem==0){
                count++;
            }
            num2/=10;
        }
        return count;
    }
}