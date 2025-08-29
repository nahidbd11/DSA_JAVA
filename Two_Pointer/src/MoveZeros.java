public class MoveZeros {
    public void moveZeroes(int[] nums) {

       int left=0;
       // change all zeros with non zero
        for(int i=0;i< nums.length;i++ ){

            if(nums[i]!=0 ){
               nums[left++]=nums[i];
            }
        }


// Fill the remaining positions in the array (from last left index to the end) with zeros
       for(int i=left;i<nums.length;i++){
           nums[i]=0;
       }

    }
}
