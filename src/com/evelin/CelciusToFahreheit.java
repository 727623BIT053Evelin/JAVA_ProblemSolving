package com.evelin;
import java.util.Scanner;
public class CelciusToFahreheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int celcius=sc.nextInt();
        int fahrenheit=(celcius*9/5)+32;
        System.out.println(fahrenheit);
    }
}
