public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        int amt = 0;
        int dup;

        for(int i = 0; i < nums.length - 1; i++){
            dup = nums[i];
            if(nums[i + 1] == dup){
                amt++;
            }

        }
        return amt; // place holder
    }
}
