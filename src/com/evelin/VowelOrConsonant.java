package com.evelin;
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);
        char c=Character.toLowerCase(ch);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
