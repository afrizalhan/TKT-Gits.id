package com.gits;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Email : ");
        String email = input.next();
        Pattern pat = Pattern.compile("[A-Za-z0-9._%+]{1,20}+@[A-Za-z0-9]+(?:\\b.co.id\\b|\\b.id\\b)");
        Matcher mat = pat.matcher(email);
        
        if (mat.matches()) {
            System.out.println("Alamat Email Valid");
        } else {
            System.out.println("Alamat Email tidak Valid");
        }

    }
}
