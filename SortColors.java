class SortColors {
    public void sortColors(int[] nums) {
        int left = 0;
        while (left < nums.length) {
            int right = left + 1;
            while (right < nums.length) {
                if(nums[left] > nums[right]) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
                right++;
            }
            left++;
        }
    }
}
