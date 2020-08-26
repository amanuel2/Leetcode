public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //01101
        int left =  0;
        int right = n;
        //00111
        while(left<right){
            int mid = left + (right-left)/2;
            if(isBadVersion(mid)){
                right = mid;
            } else{
                left =  mid + 1;
            }
        }

        return left;
    }
}