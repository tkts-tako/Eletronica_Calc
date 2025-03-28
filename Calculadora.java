import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class Calculadora
{
    public static void main(String[] args)
    {
        double n1, n2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insere os números:");

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();

        System.out.println("Insere o operador (+, -, *, /, //):");

        char op = sc.next().charAt(0);
        double total = 0;

        switch (op)
        {
            case '+':
                total = n1 + n2;
                break;

            case '-':
                total = n1 - n2;
                break;

            case '*':
                total = n1 * n2;
                break;

            case '/':
                total = n1 / n2;
                break;

            default:
                System.out.println("Operador inválido.");
        }

        System.out.println("Resultado:");
        System.out.println();

        System.out.println(n1 + " " + op + " " + n2 + " = " + total);
    }
}