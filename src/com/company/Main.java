package com.company;

import java.util.Scanner;

class Main {

    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInput("Enter number 1: ");
        int num2 = getInput("Enter number 2: ");
        // int operator = getInput("1. Add \n2. Sub \n3. Mul \n4. Div \nSelect operation:  ");
        // operation(num1, num2, operator);
        operation(num1, num2, 1);
        operation(num1, num2, 2);
        operation(num1, num2, 3);
        operation(num1, num2, 4);
        console.close();
    }

    public static int getInput(String message) {
        System.out.print(message);
        return console.nextInt();
    }

    public static void operation(int num1, int num2, int operator){
        float result = 0;
        switch (operator) {
            case 1:
                result = num1 + num2;
                System.out.println( num1+" + "+num2+" = "+ result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println( num1+" - "+num2+" = "+ result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println( num1+" * "+num2+" = "+ result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println( num1+" / "+num2+" = "+ result);
                break;
            default:
                break;

        }
    }
}