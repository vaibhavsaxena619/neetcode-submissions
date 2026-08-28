class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> hash = new HashSet<Integer>();
        for(int x : nums){
            if(hash.contains(x))
                return x;
            hash.add(x);    
        }
        return 0;
    }
}
