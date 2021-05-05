package leetcode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        //7-3=4
//        for(int i=1;i<=k;i++){
//            int p=1;
//            int lastIndex=nums[nums.length-p];
//            while(p<nums.length){
//              nums[nums.length-p]=nums[nums.length-p-1];
//              p++;
//            }
//            nums[0]=lastIndex;
//            System.out.println(Arrays.toString(nums));
//
//        }
        int clonenum[]=Arrays.copyOf(nums,nums.length);
        int index=0;
        for(int i=0;i<k;i++){
            nums[index++]=clonenum[nums.length-k+i];
        }
        for(int i=0;i<nums.length-k;i++){
            nums[index++]=clonenum[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
