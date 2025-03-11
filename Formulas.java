import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class Formulas
{
    public static void main(String[] args)
    {
        double R1, R2, R3, R4, RL;
        double I1, I2, I3, I4, IL;
        double Ui, Uo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Formulário:");
        System.out.println("1. Calcular I1");
        System.out.println("2. Calcular I2");
        System.out.println("3. Calcular I3");
        System.out.println("4. Calcular I4");
        System.out.println("5. Calcular IL");
        System.out.println("6. Sair");

        char iimput = sc.next().charAt(0);
        System.out.println("");

        switch (iimput)
        {
            case '1':
                System.out.println("I1 = Ui");
                System.out.println("     --");
                System.out.println("     R1");
                System.out.println("");
                System.out.println("Ui = ");
                Ui = sc.nextDouble();
                System.out.println("R1 = ");
                R1 = sc.nextDouble();
                I1 = Ui / R1;
                System.out.println();
                System.out.println("I1 = " + Ui);
                System.out.println("     ---");
                System.out.println("     " + R1);
                System.out.println();
                System.out.println("I1 = " + I1 + "A");
                break;
            case '2':
                System.out.println("I1 = Ui");
                System.out.println("     --");
                System.out.println("     R1");
                System.out.println("");
                System.out.println("Ui = ");
                Ui = sc.nextDouble();
                System.out.println("R1 = ");
                R1 = sc.nextDouble();
                I1 = Ui / R1;
                System.out.println();
                System.out.println("I1 = " + Ui);
                System.out.println("     ---");
                System.out.println("     " + R1);
                System.out.println();
                System.out.println("I1 = " + I1 + "A");
                break;
            case '3':
                System.out.println("I1 = Ui");
                System.out.println("     --");
                System.out.println("     R1");
                System.out.println("");
                System.out.println("Ui = ");
                Ui = sc.nextDouble();
                System.out.println("R1 = ");
                R1 = sc.nextDouble();
                I1 = Ui / R1;
                System.out.println();
                System.out.println("I1 = " + Ui);
                System.out.println("     ---");
                System.out.println("     " + R1);
                System.out.println();
                System.out.println("I1 = " + I1 + "A");
                break;
            case '4':
                System.out.println("I1 = Ui");
                System.out.println("     --");
                System.out.println("     R1");
                System.out.println("");
                System.out.println("Ui = ");
                Ui = sc.nextDouble();
                System.out.println("R1 = ");
                R1 = sc.nextDouble();
                I1 = Ui / R1;
                System.out.println();
                System.out.println("I1 = " + Ui);
                System.out.println("     ---");
                System.out.println("     " + R1);
                System.out.println();
                System.out.println("I1 = " + I1 + "A");
                break;
            case '5':
                System.out.println("I1 = Ui");
                System.out.println("     --");
                System.out.println("     R1");
                System.out.println("");
                System.out.println("Ui = ");
                Ui = sc.nextDouble();
                System.out.println("R1 = ");
                R1 = sc.nextDouble();
                I1 = Ui / R1;
                System.out.println();
                System.out.println("I1 = " + Ui);
                System.out.println("     ---");
                System.out.println("     " + R1);
                System.out.println();
                System.out.println("I1 = " + I1 + "A");
                break;
            case 6:
                break;
            default:
                System.out.println("Não foi selecionada nenhuma das opções.");
                
        }
    }
}