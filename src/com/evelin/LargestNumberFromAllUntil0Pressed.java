package com.evelin;
import java.util.Scanner;
public class LargestNumberFromAllUntil0Pressed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        System.out.println("Enter numbers (enter 0 to stop):");
        while(true){
            int n=sc.nextInt();
            if(n==0){
                System.out.println("Largest Number is "+max);
                break;
            }
            else{
                if(max<n){
                    max=n;
                }
            }
        }
    }
}
