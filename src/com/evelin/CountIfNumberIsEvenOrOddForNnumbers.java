package com.evelin;
import java.util.Scanner;
public class CountIfNumberIsEvenOrOddForNnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        for(int i=2;i<=n;i+=2){
            if(i%2==0){
                count++;//evenCount
            }
            //else{ odd_count++;}
        }
        System.out.println(count);
    }
}
