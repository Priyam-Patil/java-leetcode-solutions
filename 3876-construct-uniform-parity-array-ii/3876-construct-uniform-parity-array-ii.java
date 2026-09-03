// If smallest element is odd -> true (odd min can convert all evens to odds)
// If smallest is even & no odds exist -> true (already all even)
// If smallest is even & odds exist -> false (cannot convert odds using even min)

class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean has_odd = false;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums1) {
            if (num % 2 != 0) {
                has_odd = true;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        if (smallest % 2 != 0) {
            return true;
        }
        return !has_odd;

    }
}