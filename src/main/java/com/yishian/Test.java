package com.yishian;

public class Test {
    public static void main(String[] args) {
        int[] prices={5,3,7,10,13,4};
        int max=prices[0];
        int min=prices[0];
        int result=0;
        //m,n表示当结果最大时的数组下标
        int m=0,n=0,j,h;
        for(int i=0; i<prices.length;i++){
            min=prices[i];
            //通过循环判断大于i之后的最大值
            for( j=i+1; j<prices.length;j++){
                if(max<prices[j]){
                    max=prices[j];
                }
            }

            //判断结果大小
            if(result<max-min){
                result=max-min;
                m=i;
                for ( h=i+1;h<prices.length;h++){
                    if (max==prices[h])
                        n=h;
                }

            }
            max=prices[i];
        }

        System.out.println("m="+m+",n="+n+",result="+result);
    }

}
