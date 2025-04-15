package com.evelin;
import java.util.Scanner;
public class GetInputAndSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.print("Enter the number or 'x' to stop:");
            String s=sc.next();
            if(s.equalsIgnoreCase("x")){
                break;
            }
            int num=Integer.parseInt(s);
            sum+=num;
        }
        System.out.print("sum is "+sum);
    }
}
