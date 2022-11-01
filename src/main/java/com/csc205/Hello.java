package com.csc205;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(gcdMethod1(24, 12));
        System.out.println(gcdMethod2(24, 12));
        System.out.println(gcdMethod3(24, 12));
    }

    public static int gcdMethod1(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdMethod1(b, a % b);
    }

    public static int gcdMethod2(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int gcdMethod3(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

}
