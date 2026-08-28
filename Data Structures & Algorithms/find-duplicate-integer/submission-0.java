class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int x : nums){
                if(i == x){
                    count++;
                }
                if(count > 1)
                    return i;
            }
        }
        return 0;
    }
}
