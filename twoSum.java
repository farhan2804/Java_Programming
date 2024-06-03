// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]
import java.util.HashMap;

class twoSum {

    public static int[] findTwoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int result = target - arr[i];
            if (map.containsKey(result)) {
                return new int[] { map.get(result), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1 };
    }

    public static void main(String args[]) {
        int arr[] = { 3,2,4 };
        int target = 6;
        int[] result = findTwoSum(arr, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
