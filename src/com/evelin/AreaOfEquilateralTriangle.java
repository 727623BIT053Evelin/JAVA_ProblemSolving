package com.evelin;
import java.util.Scanner;
public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        System.out.printf("Area of Equilateral triangle is %.2f",Math.sqrt(3)/4*Math.pow(a,2));//Math.sqrt(3)/4*a*a
    }
}
