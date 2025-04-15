package com.evelin;
import java.util.Scanner;
public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(amstrong(n));
    }
    public static boolean amstrong(int n){
        int sum=0;
        int temp=n;
        int count=0;
        while(temp>0){
            int d=temp%10;
            count++;
            temp/=10;
        }
        int t=n;
        while(t>0){
            int dig=t%10;
            sum= (int) (sum+Math.pow(dig,count));
            t=t/10;
        }
        return sum==n;
    }
}
