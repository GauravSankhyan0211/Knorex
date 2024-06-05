import java.util.HashSet; 

public class solutionThree {
    public static void main(String[] args) {
        int[] arr1 = {0, -1, 2, -3, 1};
        int t1 = -2;
        System.out.println(hasTwoSum(arr1, t1)); // Output: true
        
        int[] arr2 = {1, -2, 1, 0, 5};
        int t2 = 0;
        System.out.println(hasTwoSum(arr2, t2)); // Output: false
    }

    public static boolean hasTwoSum(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true; // Found a pair that sums up to target
            }
            seen.add(num);
        }

        return false; // No such pair found
    }
}