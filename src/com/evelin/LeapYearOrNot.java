package com.evelin;
import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)||year%400==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("Non-leap year");
        }

    }
}


//package com.evelin;
//import java.util.Scanner;
//public class LeapYearOrNot {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int year=sc.nextInt();
//
//            if(year%100==0){
//                if(year%400==0){
//                    System.out.println("Leap Year");
//                }
//                else{
//                    System.out.println("Non-Leap Year");
//                }
//            }
//            else{
//                if(year%4==0){
//                    System.out.println(" Leap year");
//                }
//                else{
//                    System.out.println("Not a Leap year");
//                }
//            }
//
//    }
//}
//
