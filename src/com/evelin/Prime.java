package com.evelin;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=2;
        if(n<=1){
            System.out.println("Neither prime nor composite");
        }
        while(c*c<n){
            if(n%c==0){
                System.out.println("Not prime");
                return;
            }
            c+=1;
        }
        if(c*c>n){
            System.out.println("prime");
        }
    }
}