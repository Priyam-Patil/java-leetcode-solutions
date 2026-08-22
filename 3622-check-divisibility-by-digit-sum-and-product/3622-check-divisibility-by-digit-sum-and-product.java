
class Solution {
    public boolean checkDivisibility(int n) {
        if (n == 0) {
            return true;
        }
        int num=n;
        int sum = 0;
        int prod = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            prod *= digit;
            n = n / 10;
        }
        return num % (sum + prod) == 0 ? true : false;
    }
}