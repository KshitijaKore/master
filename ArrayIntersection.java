package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] nums1 = {1,1,2,2};
        int[] nums2 = {1,1};
        ArrayList<Integer> list=new ArrayList();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++) {
            if(map.get(nums1[i])!=null) {
                map.put(nums1[i],map.get(nums1[i])+1);
            }
            else
                map.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.get(nums2[i])!=null && map.get(nums2[i])>0){
                map.put(nums2[i],map.get(nums2[i])-1);
                list.add(nums2[i]);
            }
        }
        int[] result=new int[list.size()];
        for(int i=0;i<result.length;i++){
            result[i]=list.get(i);
        }
        System.out.println(Arrays.toString(result));
    }
}
