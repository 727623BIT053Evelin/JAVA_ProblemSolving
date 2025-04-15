package com.evelin;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextInt();
        System.out.printf("Area of circle is %.2f",Math.PI*r*r);
    }
}
