package com.evelin;
import java.util.Scanner;
public class SubtractProductSumOfDigits {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int ans=subtractProductAndSum(n);
                System.out.println("Result is "+ans);
    }
    public static int subtractProductAndSum(int n) {
        int sum=0;
        int product =1;
        while(n>0){
            int dig=n%10;
            sum+=dig;
            product*=dig;
            n/=10;
        }
        return product-sum;
    }
}
