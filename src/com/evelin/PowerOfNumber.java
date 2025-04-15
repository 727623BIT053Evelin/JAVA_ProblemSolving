package com.evelin;
import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int e=sc.nextInt();
        System.out.println(Math.pow(b,e));
    }
}
//without Math.pow
//int res=1;
//for(int i=1;i<=e;i++){
//  res*=b;
 //}
