public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        /*int right = nums.length - 1;
        int left = 0;
        while (left <= right) {

            if (nums[left] != val) {
                left++;
            } else {

                nums[left] = nums[right];
                right--;

            }


        }
        return left;
        */


        /*
        * another solution
        * */
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;

    }
}
