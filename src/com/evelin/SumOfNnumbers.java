package com.evelin;
import java.util.Scanner;
public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
            for(int i=0;i<=n;i++){
                      sum+=i;
            }
        System.out.println(sum);
    }
}
//or can be used with formula-->(n*(n+1))/2  ;