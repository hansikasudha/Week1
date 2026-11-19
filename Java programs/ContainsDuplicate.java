import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // add() returns false if the element is already present in the set
            if (!seen.add(num)) {
                return true;
            }
        }
        
        return false;
    }
}