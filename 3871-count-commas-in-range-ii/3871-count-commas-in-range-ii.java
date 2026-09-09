
class Solution {
    public long countCommas(long n) {
        long comma=0;
        long threshold=1000;
        while(threshold<=n){
            comma+=n-threshold+1;
            threshold*=1000;
        }
        return comma;
    }
}

// To count total commas, we add them layer-by-layer rather than checking range limits.
// For every thousand-fold increase (1,000, then 1,000,000, then 1,000,000,000), all numbers from that limit up to n get 1 extra comma.
// We keep multiplying our threshold by 1000 and add the count of remaining numbers (n - threshold + 1) until the threshold goes higher than n.