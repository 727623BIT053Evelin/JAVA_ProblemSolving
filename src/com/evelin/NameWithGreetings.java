package com.evelin;
import java.util.Scanner;
public class NameWithGreetings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        greet(s);
    }
    public static void greet(String s){
        System.out.println("Hello"+ " "+s);
    }
}
