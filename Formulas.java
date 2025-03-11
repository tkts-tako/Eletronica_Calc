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
        char iimput;

        Scanner sc = new Scanner(System.in);

        System.out.println("Formulário:");
        System.out.println("1. Calculadora Básica");
        System.out.println("0. Sair");

        iimput = sc.next().charAt(0);

        switch (iimput)
        {
            case '1':
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("1. Calcular Intensidade de Corrente (I)");
                System.out.println("2. Calcular Resistência (R)");
                System.out.println("3. Calcular Tensão (U)");

                iimput = sc.next().charAt(0);

                switch (iimput)
                {
                    case '1':
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println("1. Calcular I1");
                        System.out.println("2. Calcular I2");
                        System.out.println("3. Calcular I3");
                        System.out.println("4. Calcular I4");
                        System.out.println("5. Calcular IL");

                        iimput = sc.next().charAt(0);

                        switch (iimput)
                        {
                            case '1':
                                System.out.println();
                                System.out.println();
                                System.out.println();
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
                                System.out.println("I2 = Ui");
                                System.out.println("     --");
                                System.out.println("     R2");
                                System.out.println("");

                                System.out.println("Ui = ");
                                Ui = sc.nextDouble();

                                System.out.println("R2 = ");
                                R2 = sc.nextDouble();

                                I2 = Ui / R2;

                                System.out.println();
                                System.out.println("I2 = " + Ui);
                                System.out.println("     ---");
                                System.out.println("     " + R2);
                                System.out.println();
                                System.out.println("I2 = " + I2 + "A");
                                break;

                            case '3':
                                System.out.println("I3 = Ui");
                                System.out.println("     --");
                                System.out.println("     R3");
                                System.out.println("");

                                System.out.println("Ui = ");
                                Ui = sc.nextDouble();

                                System.out.println("R3 = ");
                                R3 = sc.nextDouble();

                                I3 = Ui / R3;

                                System.out.println();
                                System.out.println("I3 = " + Ui);
                                System.out.println("     ---");
                                System.out.println("     " + R3);
                                System.out.println();
                                System.out.println("I3 = " + I3 + "A");
                                break;

                            case '4':
                                System.out.println("I4 = Ui");
                                System.out.println("     --");
                                System.out.println("     R4");
                                System.out.println("");

                                System.out.println("Ui = ");
                                Ui = sc.nextDouble();

                                System.out.println("R4 = ");
                                R4 = sc.nextDouble();

                                I4 = Ui / R4;

                                System.out.println();
                                System.out.println("I4 = " + Ui);
                                System.out.println("     ---");
                                System.out.println("     " + R4);
                                System.out.println();
                                System.out.println("I1 = " + I4 + "A");
                                break;

                            case '5':
                                System.out.println("IL = Ui");
                                System.out.println("     --");
                                System.out.println("     RL");
                                System.out.println("");

                                System.out.println("Ui = ");
                                Ui = sc.nextDouble();

                                System.out.println("RL = ");
                                RL = sc.nextDouble();

                                IL = Ui / RL;
                                
                                System.out.println();
                                System.out.println("IL = " + Ui);
                                System.out.println("     ---");
                                System.out.println("     " + RL);
                                System.out.println();
                                System.out.println("IL = " + IL + "A");
                                break;

                            default:
                                System.out.println("Não foi selecionada nenhuma das opções.");
                            }

                            break;

                    default:
                        System.out.println("Não foi selecionada nenhuma das opções.");
                }

               break;
                
            case '0':
                break;

            default:
                System.out.println("Não foi selecionada nenhuma das opções.");
        }
    }
}