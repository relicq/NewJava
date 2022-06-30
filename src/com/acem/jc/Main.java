package com.acem.jc;
import java.util.Scanner;
import com.acem.jc.*;

public class Main{
    static int valid = 0;    
    public static void main(String args[]){
        Scanner op = new Scanner(System.in);
        System.out.println("Enter the operation(+,-,*,/)");
        String operator = op.nextLine();

        System.out.println("Enter the first number");
        double n1 = op.nextDouble();

        System.out.println("Enter the second number");
        double n2= op.nextDouble();
    
        Calculater operation = null;
        switch (operator){
        case ("+"):
            operation = new Addcommand();
            valid = 1;
            break;
        case ("-"):
            operation = new Subcommand();
            valid = 1;
            break;
        case ("*"):
            operation = new Multcommand();
            valid = 1;
            break;
        case ("/"):
            operation = new Divcommand();
            valid = 1;
            break;
        default:
            break;
        }
        if (valid == 1){
        double result = operation.calculate(n1, n2);
        System.out.println("The result is: "+ result);
        }
        else{
        System.out.println("Invalid operation");
        }

    }
}