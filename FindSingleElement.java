package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FindSingleElement {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,3};

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],0);
        }
        for(int i=0;i< nums.length;i++){
            if(null != map.get(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
        }
        Optional<Integer> any = map.entrySet().stream().filter(integerIntegerEntry -> integerIntegerEntry.getValue() == 1).map(Map.Entry::getKey).findAny();
        System.out.println(any.get());

        findUniqueElement(nums);
    }

    private static void findUniqueElement(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            a^=nums[i];
        }
        System.out.println(a);
    }
}
