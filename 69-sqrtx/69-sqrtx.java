class Solution {
    public int mySqrt(int x) {
        // binary search algoritm
        // if x= 0 then 0 
        if(x==0)
            return x;
        
        // lower bond = 1
        // end = number
        int start = 1, end = x;
        while (start < end) {
            int mid = start + (end - start) / 2 + 1;
            if (x / mid >= mid) 
                start = mid;
            else 
                end = mid - 1;
        }
        return start;
    }
       
}