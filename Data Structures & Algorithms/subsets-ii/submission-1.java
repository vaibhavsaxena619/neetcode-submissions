class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();

        generate(nums, 0, new ArrayList<>(), set);

        return new ArrayList<>(set);
    }

    private void generate(
            int[] nums,
            int index,
            List<Integer> current,
            Set<List<Integer>> set) {

        if (index == nums.length) {
            set.add(new ArrayList<>(current));
            return;
        }

        // Include
        current.add(nums[index]);
        generate(nums, index + 1, current, set);

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude
        generate(nums, index + 1, current, set);
    }
}