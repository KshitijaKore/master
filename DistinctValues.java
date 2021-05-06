package leetcode;

import java.util.HashSet;

public class DistinctValues {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        HashSet<Integer> set=new HashSet<>();
        for(int i =0;i<nums.length;i++){
            boolean flag=set.add(nums[i]);
            if(!flag) {
                System.out.println("true");
                break;
            }

        }
    }
}
