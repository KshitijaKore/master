package leetcode;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices={4,2,1,7,11};
        int min=-1,max=-1,profit=0;
        for(int i=0;i<=prices.length-2;i++){
            int j=i+1;
            if(prices[i]<prices[j] && min==-1) {
                min = prices[i];
            }
            if(min!=-1 && (j+1==prices.length || prices[j]>prices[j+1])) {
                max = prices[j];
                i=j;
            }
            if(min!=-1 && max !=-1) {
                profit += max - min;
                min=-1;
                max=-1;
            }
        }
        System.out.println(profit);
    }
}
