class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        
        //Sort from min to max
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });
        
        //List of integer
        List<int[]> list = new ArrayList();
        
        //Adds but MAIN POINT
        //IS it adds VIA PASS BY REFERENCE
        list.add(intervals[0]);
        
        //CURR = INTERVAL BY REFERENCE
        int[] curr = intervals[0];
        for(int[] interval: intervals){
            
            //If Overlap
            if(curr[1] >= interval[0] ){
                //Change the MAX of Last value
                //Which changes list since it was
                //added via PASS BY REFEREMCE
                curr[1] = Math.max(curr[1], interval[1]);
            } else{
                //Here change the REFERENCE to the next interval
                //if no overlap
                curr = interval;
                list.add(curr);
            }
        }
        
        
        //Finnaly add the double arraylist
        return list.toArray(new int[list.size()][]);
    }
}