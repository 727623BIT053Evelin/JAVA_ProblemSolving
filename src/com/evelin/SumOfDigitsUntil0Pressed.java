package com.evelin;
import java.util.Scanner;
public class SumOfDigitsUntil0Pressed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter numbers to add (enter 0 to stop):");
        while(true){
            int n=sc.nextInt();
            if(n==0){
                System.out.println("Sum is "+sum);
               break;
            }
            else{
                sum+=n;
            }
        }
    }
}
