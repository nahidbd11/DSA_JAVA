public class RemoveDuplicateSortedArray {


    public int removeDuplicates(int[] nums) {
        int left=0;

        for (int right=1;right<nums.length;right++){

            if(nums[left]!=nums[right]){
                left++;
                nums[left]=nums[right];
            }
        }

        System.out.println("number of duplicate:"+(left+1));
        return left+1;

    }

}
