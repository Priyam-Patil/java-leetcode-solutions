import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        int currR = rowIndex + 1;//bec they are given idx (ex idx0->row1)
        List<Integer> list = new ArrayList<>();
        long res = 1;
        list.add((int) res);
        for (int col = 1; col < currR; col++) {
            res = res * (currR - col);
            res = res / col;
            list.add((int) res);
        }
        return list;

    }
}