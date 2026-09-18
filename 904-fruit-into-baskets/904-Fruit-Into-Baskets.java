class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int maxi=0;
        int l=0;
        for(int i=0;i<n;i++){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            while (map.size()>2){
                int fruit=fruits[i];
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                }
                l++;
            }
            int len = i-l+1;
            maxi=Math.max(maxi,len);
        }
        return maxi;
    }
}