package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            checkTriangle();
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }

    }

    public static void checkTriangle() throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh của một tam giác");
        int a, b, c;
        System.out.println("Nhập vào cạnh thứ 1: ");
        a = sc.nextInt();
        System.out.println("Nhập vào cạnh thứ 2: ");
        b = sc.nextInt();
        System.out.println("Nhập vào cạnh thứ 3: ");
        c = sc.nextInt();
        boolean isTriangle = (a + b <= c) || (a + c <= b) || (b + c <= a);
        if (!isTriangle) {
            System.out.println("Nó là 1 tam giác");
        } else {
            throw new IllegalTriangleException();
        }
    }
}
