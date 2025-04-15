package com.evelin;
import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Factors of "+n+"is");
        for(int i=1;i<=n;i++){
                if(n%i==0){
                    System.out.print(i+" ");
                }
        }
    }
}
