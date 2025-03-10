import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class Calculadora
{
    public static void main(String[] args)
    {
        double num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insere os números:");

        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println("Insere o operador (+, -, *, /):");

        char op = sc.next().charAt(0);
        double o = 0;

        switch (op)
        {
            case '+':
                o = num1 + num2;
                break;

            case '-':
                o = num1 - num2;
                break;

            case '*':
                o = num1 * num2;
                break;

            case '/':
                o = num1 / num2;
                break;

            default:
                System.out.println("Operador inválido.");
        }

        System.out.println("Resultado:");
        System.out.println();

        System.out.println(num1 + " " + op + " " + num2 + " = " + o);
    }
}
