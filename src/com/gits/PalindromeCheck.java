package com.gits;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String s = input.next();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        String reversed = sb.toString();

        System.out.println(s.equalsIgnoreCase(reversed));
    }
}
