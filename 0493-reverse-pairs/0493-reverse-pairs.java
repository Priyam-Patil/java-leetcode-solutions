// Merge Sort

class Solution {

    // Count reverse pairs between left and right halves
    public int countPairs(int[] nums, int si, int mid, int ei) {

        int cnt = 0;

        // Start from first element of right half
        int right = mid + 1;

        // Check every element of left half
        for (int i = si; i <= mid; i++) {

            // Find elements in right half satisfying nums[i] > 2 * nums[right]
            while (right <= ei && (long)nums[i] > 2L * nums[right]) {
                right++;
            }

            // Add number of valid elements found
            cnt += right - (mid + 1);
        }

        // Return reverse pair count
        return cnt;
    }


    // Merge sort function
    public int mergesort(int[] nums, int si, int ei) {

        // Store total count
        int count = 0;

        // Base case
        if (si >= ei) {
            return count;
        }

        // Find middle index
        int mid = si + (ei - si) / 2;

        // Count pairs in left half
        count += mergesort(nums, si, mid);

        // Count pairs in right half
        count += mergesort(nums, mid + 1, ei);

        // Count pairs between left and right halves
        count += countPairs(nums, si, mid, ei);

        // Merge both sorted halves
        merge(nums, si, mid, ei);

        // Return total count
        return count;
    }


    // Merge two sorted halves
    public void merge(int[] nums, int si, int mid, int ei) {

        // Temporary array
        int[] temp = new int[ei - si + 1];

        // Pointer for left half
        int i = si;

        // Pointer for right half
        int j = mid + 1;

        // Pointer for temp array
        int k = 0;

        // Compare both halves
        while (i <= mid && j <= ei) {

            // If left element is smaller
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];

            } else {
                // Otherwise take right element
                temp[k++] = nums[j++];
            }
        }

        // Add remaining left elements
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // Add remaining right elements
        while (j <= ei) {
            temp[k++] = nums[j++];
        }

        // Copy temp back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            nums[i] = temp[k];
        }
    }


    // Main function
    public int reversePairs(int[] nums) {

        // Start merge sort from 0 to last index
        return mergesort(nums, 0, nums.length - 1);
    }
}