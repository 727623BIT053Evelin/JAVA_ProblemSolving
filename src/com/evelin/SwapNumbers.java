package com.evelin;
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        swap(num1,num2);
        System.out.print(num1+ "and" +num2);
    }
    public static void swap(int n,int m){
        int temp=n;
        n=m;
        m=temp;
       System.out.println(n+ "and" +m);//function scope->changes will not reflect in the main function
    }
}
