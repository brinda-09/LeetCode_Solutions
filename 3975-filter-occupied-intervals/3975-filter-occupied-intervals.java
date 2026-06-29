class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        Arrays.sort(occupiedIntervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> li=new ArrayList<>();
        for(int[] brr:occupiedIntervals){
            if(li.isEmpty()||li.get(li.size()-1)[1]+1<brr[0]){
                li.add(new int[]{brr[0],brr[1]});
            }else{
                li.get(li.size()-1)[1]=Math.max(li.get(li.size()-1)[1],brr[1]);
            }
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int[] brr:li){
            int s=brr[0];
            int e=brr[1];
            if(s>freeEnd||e<freeStart){
                list.add(Arrays.asList(s,e));
            }else{
                if(s<freeStart){
                    list.add(Arrays.asList(s,freeStart-1));
                } if(e>freeEnd){
                    list.add(Arrays.asList(freeEnd+1,e));
                }
            }
        }

    return list;
    }
}