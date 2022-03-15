package com.Harman.utkarsh;

import java.util.Scanner;

public class Calculator extends ParentCalculator {


    public static void main(String[] args) {
        // Object Creation

         Calculator object = new Calculator();

        Scanner input = new Scanner(System.in);
        int n1,n2,result1,result2,result3;
        System.out.println("Enter the num1");
        n1 = input.nextInt();
        System.out.println("Enter the num2");
        n2 = input.nextInt();
        result1 = object.AdditionOperation(n1,n2);
        result2 = object.SubOperation(n1,n2);
        result3 = object.Multiplication(n1,n2);
        System.out.println("The addition value"  +result1);
        System.out.println(" the Sub value"  +result2);
        System.out.println(" the multi value"  +result3);
    }
}
