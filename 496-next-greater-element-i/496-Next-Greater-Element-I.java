class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] ans=new int[n1];
        for(int i=0;i<n1;i++){
            int idx=-1;
            int j=n2-1;
            while(j>=0 && nums2[j]!=nums1[i]){
                if(nums2[j]>nums1[i]){
                    idx=nums2[j];
                }
                j--;
            }
            ans[i]=idx;
        }
        return ans;
    }
}