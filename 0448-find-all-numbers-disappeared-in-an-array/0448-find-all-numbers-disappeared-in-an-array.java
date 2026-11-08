
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        boolean[] check = new boolean[n];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (check[num - 1] == false) {
                check[num - 1] = true;
            }
        }
        for (int i = 0; i < n; i++) {
            if (check[i] == false) {
                list.add(i + 1);

            }
        }

        return list;

    }
}