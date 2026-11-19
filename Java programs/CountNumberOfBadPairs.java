import java.util.HashMap;
import java.util.Map;

class CountNumberOfBadPairs {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long totalPairs = (n * (n - 1)) / 2;
        long goodPairs = 0;
        
        Map<Integer, Long> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int key = nums[i] - i;
            // If this key has appeared before, those previous occurrences form good pairs with the current element
            if (map.containsKey(key)) {
                goodPairs += map.get(key);
            }
            // Update the frequency of this key in the map
            map.put(key, map.getOrDefault(key, 0L) + 1);
        }
        
        return totalPairs - goodPairs;
    }
}