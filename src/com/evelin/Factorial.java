package com.evelin;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}

//     using recursive function
//public static int factorialNum(int n){
//    if(n==0||n==1){
//        return 1;
//    }
//    else{
//        return n*factorialNum(n-1);
//    }
//}
//
//      main function
//System.out.println(factorilNum(n));
