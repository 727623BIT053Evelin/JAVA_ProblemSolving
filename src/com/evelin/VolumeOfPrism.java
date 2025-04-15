package com.evelin;
import java.util.Scanner;
public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double l=sc.nextInt();
        double b=sc.nextInt();
        double h=sc.nextInt();
        System.out.printf("Volume of prism is %.2f",l*b*h);
    }

}
