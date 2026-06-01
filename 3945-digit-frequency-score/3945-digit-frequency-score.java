class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n!=0){
            int dig=n%10;
          map.put(dig, map.getOrDefault(dig, 0) + 1);
            n=n/10;
        }
        
        int freq=0;
        for(int i=0;i<=9;i++){
             freq+=(i*map.getOrDefault(i,0));
        }
        return freq;
    }
}