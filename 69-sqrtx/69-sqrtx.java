class Solution {
    public int mySqrt(int x) {
       // binary search algoritm
        if(x==0)
            return x;
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