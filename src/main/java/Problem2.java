public class Problem2 {

    /*
     * My algorithm removes the duplicates by tracking which index it is looking for duplicates from. This is the
     * newAmt variable and when it finds no more duplicates it adds the old element to the index of newAmt. It then
     * repeats this with each element until there is no more and after the for loop it checks the last element. It then
     * returns the variable newAmt because it contains the index of the last none duplicate number.
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        int newAmt = 0;

        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] != nums[i + 1]) {
                nums[newAmt] = nums[i];
                newAmt++;
            }
        }
        nums[newAmt] = nums[nums.length - 1];
        newAmt++;

        return newAmt;
    }
}
