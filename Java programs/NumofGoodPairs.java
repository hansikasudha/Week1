import java.util.HashMap;
import java.util.Map;

class NumofGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int goodPairs = 0;
        
        for (int num : nums) {
            // Get the current count of this number, default to 0 if not seen yet
            int count = countMap.getOrDefault(num, 0);
            
            // Each previous occurrence forms a good pair with the current number
            goodPairs += count;
            
            // Increment the count for this number in the map
            countMap.put(num, count + 1);
        }
        
        return goodPairs;
    }
}