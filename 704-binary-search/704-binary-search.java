class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            // Find the mid 
            int mid = start + (end-start)/2;
            // target is less than element 
            if(nums[mid] < target){
                start = mid +1;
            } else if(nums[mid] > target){
                end = mid -1;
            } else{
                return mid;
            }
        } 
        // not found 
        return -1;
        
    }
}