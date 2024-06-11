package com.excersice2;

import java.util.Scanner;

import com.excersice2.entity.calculator;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        Scanner varNum1 = new Scanner(System.in);
        Scanner varNum2 = new Scanner(System.in);
        Scanner varScann = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        float num1 = varNum1.nextFloat();
        System.out.println("Ingresa un numero: ");
        float num2 = varNum2.nextFloat();
        calculator cal = new calculator(num1, num2);
        while (x != 0) {
            System.out.println("Para sumar --> 1" + "\n" +
            "Para restar --> 2" + "\n" +
            "Para multiplicar --> 3" + "\n" +
            "Para dividir --> 4" + "\n"+
            "Para salir --> 0");
            Integer var = varScann.nextInt();
            if (var == 1) {
                System.out.println(cal.SumaEntero(num1, num2));
            }else if (var == 2) {
                System.out.println(cal.RestaEntero(num1, num2));
            }else if (var == 3) {
                System.out.println(cal.MultEntero(num1, num2));
            }else if (var == 4) {
                System.out.println(cal.DivEntero(num1, num2));
            }else if (var == 0) {
                x = 0;
            }
        }
       
    }
}