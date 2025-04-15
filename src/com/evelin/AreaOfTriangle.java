package com.evelin;
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double b=sc.nextInt();
        double h=sc.nextInt();
        System.out.printf("Area of Triangle is %.2f",0.5*b*h);
    }
}
