import java.util.Arrays;

public class SortedSquares {

    /*
    * nlogn solution
    * */
    /*public int[] sortedSquares(int[] nums) {

         for(int i=0;i< nums.length;i++){
             nums[i]=nums[i]*nums[i];
         }

         return Arrays.stream(nums).sorted().toArray();
    }*/


    /*
     O(n) solution
    * **/
/*
    public int[] sortedSquares(int[] nums){

        int[] squares=new int[nums.length];
        int left=0;
        int right=nums.length-1;

        for (int i= nums.length-1;i>=0;i--){

            int leftSquare= nums[left]*nums[left];
            int rightSquare=nums[right]*nums[right];

               if(rightSquare>leftSquare){
                   squares[i]=rightSquare;
                   right--;
               }else {
                   squares[i]=leftSquare;
                   left++;
               }

        }

        return  squares;

    }  */

    /*
    * another O(n) solution using absolute value as array is sorted
    * */

    public int[] sortedSquares(int[] nums){

        int[] squares=new int[nums.length];
        int left=0;
        int right=nums.length-1;

        for (int i= nums.length-1;i>=0;i--){

            int leftAbs= nums[left] <0 ? -nums[left]:nums[left];  //-11=11
            int rightAbs=nums[right] <0 ? -nums[right]:nums[right]; //10 = 10

            if(rightAbs>leftAbs){
                squares[i]= rightAbs*rightAbs;
                right--;
            }else {
                squares[i]=leftAbs*leftAbs;
                left++;
            }

        }

        return  squares;

    }
}
