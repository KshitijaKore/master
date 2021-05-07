package leetcode;

import java.util.Arrays;

public class PlusOneDigit {
    public static void main(String[] args) {
        int[] num={9,9,9};
        int carry=0;
       // int[] num={1,2,3};
        for(int i=num.length-1;i>=0;i--){
            if(num[i]!=9 && i==num.length-1){
               num[i]=num[i]+1;
               break;
            }
            else{
              carry= num[i]+1==10?1:0;
              if(carry==1){
                  num[i]=0;
              }
              else {
                  num[i]= num[i] + 1;
                  break;
              }
            }
        }
        if(carry!=0)
        {
         int[] result=new int[num.length+1];
         result[0]=1;
            System.out.println(Arrays.toString(result));
        }
        System.out.println(Arrays.toString(num));

    }
}
