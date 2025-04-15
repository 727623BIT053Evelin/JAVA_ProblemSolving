package com.evelin;
import java.util.Scanner;
public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextInt();
        System.out.printf("Perimeter of a circle is %.2f",2*Math.PI*r);
    }
}
