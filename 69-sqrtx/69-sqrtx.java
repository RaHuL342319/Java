class Solution {
    public int mySqrt(int x) {
        // binary search algoritm
        // if x= 0 then 0 
        if(x==0)
            return x;
        
        // lower bond = 1
        int l = 1, r = x;
        while (l < r) {
            int m = l + (r - l) / 2 + 1;
            if (x / m >= m) 
                l = m;
            else 
                r = m - 1;
        }
        return l;
    }
       
}