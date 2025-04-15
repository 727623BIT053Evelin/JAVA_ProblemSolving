package com.evelin;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double l=sc.nextInt();
        double b=sc.nextInt();
        System.out.printf("Area of Rectangle is %.2f",l*b);
    }
}
