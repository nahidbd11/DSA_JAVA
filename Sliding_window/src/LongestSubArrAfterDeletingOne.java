public class LongestSubArrAfterDeletingOne {
    public int longestSubarray1(int[] nums) {

        int l=0,countZero=0,maxCount=0;
        for(int r=0;r< nums.length;r++){
            if(nums[r]==0) countZero++;
            while (countZero>1){
                if(nums[l]==0) countZero--;
              l++;
            }

            if(countZero<=1){
                maxCount=Math.max(maxCount,r-l);
            }

        }

        return maxCount;

    }
/**
 * avoid nested while loop
 * */
    public int longestSubarray2(int[] nums) {

        int l=0,countZero=0,maxCount=0;
        for(int r=0;r< nums.length;r++){
            if(nums[r]==0) countZero++;
            if (countZero>1){
                if(nums[l]==0) countZero--;
                l++;
            }

            if(countZero<=1){
                maxCount=Math.max(maxCount,r-l);
            }

        }

        return maxCount;

    }

    /**
     *
     *
     * short solution
     **/

    public int longestSubarray3(int[] nums) {

        int l=0,zeroIndex=-1,maxCount=0;
        for(int r=0;r< nums.length;r++){
            if(nums[r]==0){
                l=zeroIndex+1;
                zeroIndex=r;
            }
                maxCount=Math.max(maxCount,r-l);
        }

        return maxCount;

    }
}
