public class LongestOnes {

   /*
    public int longestOnes(int[] nums, int k) {
          int l=0,r=0,maxsub=0,numOfZero=0;
          while(r< nums.length){
                if(nums[r]==0) numOfZero++;
                while(numOfZero>k){
                    if(nums[l]==0) numOfZero--;
                    l++;
                }
              if(numOfZero<=k) maxsub=Math.max(maxsub,r-l+1);
           r++;
          }

          return maxsub;
    }*/

    /***
     *
     *  avoid nested loop solution
     */
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,maxsub=0,numOfZero=0;
        while(r< nums.length){
            if(nums[r]==0) numOfZero++;
            if(numOfZero>k){
                if(nums[l]==0) numOfZero--;
                l++;
            }
            if(numOfZero<=k) maxsub=Math.max(maxsub,r-l+1);
            r++;
        }

        return maxsub;
    }
}
