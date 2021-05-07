package leetcode;

import java.util.Arrays;

public class MoveZeroAtEnd {
    public static void main(String[] args) {
        int[] num={0,1,0,0,12,4};
        int index=0;
        for(int i=0;i<num.length;i++){
          if(num[i]!=0){
              num[index++]=num[i];
          }
        }
        for(int i=index;i<num.length;i++){
            num[i]=0;
        }
        System.out.println(Arrays.toString(num));
    }
}
