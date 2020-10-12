public class Problem1 {

    /*
     * My algorithm goes through each individual element in the array. If the element is a 0
     * it will add one to the zero variable and at the end, turn that amount of zeros into the start of the array.
     * If the element is a 2 it will add to the two variable and at the end, turn that amount of twos into the
     * end of the array. The rest of the array will then be turned into ones since there can only be 0, 1 and 2 in
     * the array and there is at least one of each.
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int zero = 0;
        int two = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zero++;
            }
            else if (nums[i] == 2){
                two++;
            }
        }
        int sLength = nums.length - zero - two;
        for(int k = 0; k < zero; k++){
            nums[k] = 0;
        }
        for(int k = nums.length - two; k < nums.length; k++){
            nums[k] = 2;
        }
        for(int k = zero; k <= sLength; k++){
            nums[k] = 1;
        }
    }
}
