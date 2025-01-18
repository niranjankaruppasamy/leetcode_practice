class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int res = 0;
        while (left < right) {
            int length = right-left; // Distance between left and right
            int width = Math.min(height[left], height[right]); // Shorter line
            res = Math.max(res, length * width); // Update maximum area
            // Move the pointer pointing to the shorter line
            if (height[left]<height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}
