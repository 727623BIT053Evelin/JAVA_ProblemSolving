package com.evelin;
import java.util.Arrays;
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(isPalindrome(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
    public static boolean isPalindrome(String s){
        char[] st=new char[s.length()];
        for(int i=0;i<s.length();i++){
            st[s.length()-1-i]=s.charAt(i);
        }
        String str=new String(st);
        return s.equalsIgnoreCase(str);
    }
}
