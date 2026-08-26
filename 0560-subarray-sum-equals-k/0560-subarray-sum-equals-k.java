
// hashmap+prefix sum count
import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0, sum = 0;
        map.put(0, 1);//initially prefix=0 has occured one
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}



// import java.util.*;
// class Solution {
//     public int subarraysWithXorK(int[] nums, int k) {
//       HashMap<Integer,Integer> map=new HashMap<>();
//       map.put(0,1);
//       int xor=0;
//       int count=0;
//       for(int i=0;i<nums.length;i++){
//         xor=xor^nums[i];
//         if(map.containsKey(xor^k)){
//             count+=map.get(xor^k);
//         }
// map.put(xor,map.getOrDefault(xor,0)+1);
//       }
//       return count;
//     }
// }