package com.evelin;
import java.util.Scanner;
public class FunctionVoting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        voting(n);
    }
    public static void voting(int n){
        if(n>=18){
            System.out.println("elligible to vote");
        }
        else{
            System.out.println("Not elligible to vote");


        }
    }
}
