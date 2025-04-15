package com.evelin;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println("SI="+(p*n*r)/100);
    }
}
//max use doublr fot this...(can use t instead of n)-->p*t*r/100