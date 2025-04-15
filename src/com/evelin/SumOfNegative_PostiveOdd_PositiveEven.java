package com.evelin;
import java.util.Scanner;
public class SumOfNegative_PostiveOdd_PositiveEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       int negative_sum=0;
        int positive_odd_sum=0;
        int positive_even_sum=0;
       while(true){
           int n=sc.nextInt();
           if(n==0){
               break;
           }
           else if (n<0){
               negative_sum+=n;
           }
           else if (n>0 && n%2==0) {
               positive_even_sum+=n;
           }
           else if (n>0 && n%2!=0) {
               positive_odd_sum+=n;
           }
       }
       System.out.println("positive_odd="+positive_odd_sum);
        System.out.println("positive_even="+positive_even_sum);
        System.out.println("negative_sum="+negative_sum);
    }
}
