class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int[][] res = new int[K][];
        int count = 0;
        
        //Create queue to get min distance elements first
        Queue<int[]> queue = new PriorityQueue(new Comparator<int[]>(){
            public int compare(int[]a, int[]b){
                //order matters here
                double dist_a = getDistance(a);
                double dist_b = getDistance(b);
                
                //Makes sure that min are listed first
                //then max. if u want reverse then reverse 
                // 1 and -1
                if(dist_a == dist_b) return 0;
                else if(dist_a > dist_b) return 1;
                else return -1;
            }
        });
        
        //add points and queue will reorder them
        //based on distance
        for(int[] point: points){
            queue.add(point);
        }
        
        //Pop out the K Least distance to origin
        for(int i=0; i<K; i++){
            res[count] = queue.poll();
            count++;
        }
        
        //return
        return res;
    }

    public double getDistance(int[] point){
        return Math.sqrt(Math.pow(point[0],2) + Math.pow(point[1],2));
    }
}