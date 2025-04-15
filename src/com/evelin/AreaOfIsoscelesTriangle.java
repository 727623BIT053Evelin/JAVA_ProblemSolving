package com.evelin;
import java.util.Scanner;
public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        //area=(1/2)*b*Math.sqrt((Math.pow(a,2)-Math.pow(b,2)/4))
        //or
        //(1/2)*b*Math.sqrt(a*a-((b*b)/4))
        if(4*a*a<=b*b){
            System.out.println("Invalid dimensions for an isosceles triangle.");//sqrt cannot be applied for -ve value
        }
        else{
            System.out.printf("Area of Isosceles triangle is %.2f",0.5*b*Math.sqrt((Math.pow(a,2)-Math.pow(b,2)/4)));
        }
    }
}
