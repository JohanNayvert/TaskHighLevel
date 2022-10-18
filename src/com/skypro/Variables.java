package com.skypro;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Variables");
        System.out.println();

        mathAbc();
        variableShift();
        averageNumber();

        System.out.println("HomeWork Complete");

    }
    //task-3
    private static void averageNumber() {
        System.out.println("Task-3");
        int a = 575;
        int b = (a/10)%10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();
    }

    //task-2
    private static void variableShift() {
        System.out.println("Task-2");
        int a = 5;
        int b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();
    }

    //task-1
    private static void mathAbc() {
        System.out.println("Task-1");
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        result = Math.abs(result);
        System.out.println("result = " + result);
        System.out.println();
    }
}
