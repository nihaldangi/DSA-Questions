
import java.util.HashSet;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//Brute force method 

public class distinct_element {

//     public static boolean containsDuplicate(int nums[]) {
//         for(int i=0; i<nums.length-1; i++) {
//             for(int j=i+1; j<nums.length; j++) {
//                 if( nums[i] == nums[j] ) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//Using Sets 

    public static boolean containsDuplicate(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 6, 8, 9};
        System.out.println(containsDuplicate(nums));
    }
}