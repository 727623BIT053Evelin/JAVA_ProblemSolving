package com.evelin;
import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextInt();
        double h=sc.nextInt();
        System.out.printf("Volume of a Cylinder is %.2f",Math.PI*r*r*h);
    }
}
