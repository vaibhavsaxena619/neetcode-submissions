class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0, set, list);
        return new ArrayList<>(set);
    }

    private void backtrack(int[] nums, int index, Set<List<Integer>> set, List<Integer> list){
        set.add(new ArrayList<>(list));
        for(int i = index; i < nums.length; i++){
            list.add(nums[i]);
            backtrack(nums, i + 1, set, list);
            list.remove(list.size() - 1);
        }
    }
}
