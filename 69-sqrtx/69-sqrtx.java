class Solution {
    public int mySqrt(int x) {
        // binary search algoritm
        
        long start = 1;
        long end = x;
        int ans=0;
        
        if (x == 0 || x == 1)
            return x;
        
        while(start<= end){
            
            // find mid
            long mid = start + (end-start)/2;
            
            if(mid*mid <= x){
                start = mid+1;
                ans = (int)mid;
            }
            else{
                end = mid -1;
            }
        }
        return ans;
    }
}