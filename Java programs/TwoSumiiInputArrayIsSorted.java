class TwoSumiiInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                // Return 1-indexed positions
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++; // We need a larger sum, so move the left pointer right
            } else {
                right--; // We need a smaller sum, so move the right pointer left
            }
        }
        
        return new int[] {}; // Since there is guaranteed to be one solution, this is a fallback
    }
}