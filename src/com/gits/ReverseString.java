package com.gits;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String s = input.next();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        System.out.println(sb);
    }
}
