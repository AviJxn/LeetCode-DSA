class Solution {
    public int timeRequiredToBuy(int[] ticket, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<ticket.length;i++){
            q.add(i);
        }
        int time=0;
        while(!q.isEmpty()){
            int person=q.poll();
            ticket[person]--;
            time++;
            if(ticket[person]>0){
                q.add(person);
            }
            else if(ticket[person]==0 && person==k) return time;
        }
        return time;
    }
}