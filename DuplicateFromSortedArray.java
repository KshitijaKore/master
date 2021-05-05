package leetcode;

public class DuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,3,4,4,5,5,6};
        int index=1;
        for(int i=0;i<nums.length-1;i++){
           if(nums[i]!=nums[i+1]){
               nums[index++]=nums[i+1];
           }
        }
        System.out.println(index);
    }
}
