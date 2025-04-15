package com.evelin;
import java.util.Scanner;
public class CSACylinder {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            double r=sc.nextInt();
            double h=sc.nextInt();
            System.out.printf("curved Surface Area of cylinder is %.2f",2*Math.PI*r*h);
    }
}
