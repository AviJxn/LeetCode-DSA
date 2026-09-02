class Solution {
    public List<Integer> findWordsContaining(String[] word, char x) {
        ArrayList<Integer>map=new ArrayList<>();
        for(int i=0;i<word.length;i++){
            if(word[i].indexOf(x)!=-1){
                map.add(i);
            }
        }
        return map;
    }
}