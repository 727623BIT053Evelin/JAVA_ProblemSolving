package com.evelin;
import java.util.Scanner;
public class CountingOccurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int count=0;
        while(n>0){
            int dig=n%10;
            if(dig==m)
            {
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
