package com.excersice2.entity;

public class calculator {

    private float num1;
    private float num2;

    public calculator(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float SumaEntero(float num1, float num2) {
        return num1 + num2;
    }

    public float RestaEntero(float num1, float num2) {
        return num1 - num2;
    }

    public float MultEntero(float num1, float num2) {
        return num1 * num2;
    }

    public float DivEntero(float num1, float num2) {
        return num1 / num2;
    }
}
