import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Formulas {
    private static final Scanner sc = new Scanner(System.in);
    private static final DecimalFormat df = new DecimalFormat("#.#####");

    public static void main(String[] args) {
        boolean sair = false;
        while (!sair) {
            mostrarMenuPrincipal();
            char opc = lerOpcao();
            switch (opc) {
                case '1' -> menuCalculadoraBasica();
                case '0' -> {
                    System.out.println("Saindo... Até logo.");
                    sair = true;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();
        }
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("Formulário:");
        System.out.println("1. Calculadora Básica");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static char lerOpcao() {
        String s = sc.next();
        return s.isEmpty() ? '\0' : s.charAt(0);
    }

    private static void menuCalculadoraBasica() {
        System.out.println();
        System.out.println("1. Calcular Intensidade de Corrente (I)");
        System.out.println("2. Calcular Resistência (R)");
        System.out.println("3. Calcular Tensão (U)");
        System.out.print("Escolha uma opção: ");
        char opc = lerOpcao();
        switch (opc) {
            case '1' -> menuCalcularI();
            case '2' -> menuCalcularR();
            case '3' -> menuCalcularU();
            default -> System.out.println("Opção inválida no menu Calculadora Básica.");
        }
    }

    private static void menuCalcularI() {
        System.out.println();
        System.out.println("1. Calcular I1");
        System.out.println("2. Calcular I2");
        System.out.println("3. Calcular I3");
        System.out.println("4. Calcular I4");
        System.out.println("5. Calcular IL");
        System.out.print("Escolha uma opção: ");
        char opc = lerOpcao();
        switch (opc) {
            case '1' -> calcularI("I1");
            case '2' -> calcularI("I2");
            case '3' -> calcularI("I3");
            case '4' -> calcularI("I4");
            case '5' -> calcularI("IL");
            default -> System.out.println("Nenhuma das opções foi selecionada.");
        }
    }

    private static void calcularI(String label) {
        try {
            System.out.println();
            System.out.println(label + " = Ui / R");
            double Ui = lerDouble("Ui (V): ");
            double R = lerDouble("R (Ω): ");
            if (R == 0) {
                System.out.println("Erro: resistência não pode ser zero.");
                return;
            }
            double I = Ui / R;
            System.out.println();
            System.out.println(label + " = " + df.format(Ui) + " / " + df.format(R));
            System.out.println(label + " = " + df.format(I) + " A");
        } catch (InputMismatchException e) {
            limparScanner();
            System.out.println("Entrada inválida. Valores numéricos esperados.");
        }
    }

    private static void menuCalcularR() {
        System.out.println();
        System.out.println("1. Calcular R1");
        System.out.println("2. Calcular R2");
        System.out.println("3. Calcular R3");
        System.out.println("4. Calcular R4");
        System.out.println("5. Calcular RL");
        System.out.print("Escolha uma opção: ");
        char opc = lerOpcao();
        switch (opc) {
            case '1' -> calcularR("R1");
            case '2' -> calcularR("R2");
            case '3' -> calcularR("R3");
            case '4' -> calcularR("R4");
            case '5' -> calcularR("RL");
            default -> System.out.println("Nenhuma das opções foi selecionada.");
        }
    }

    private static void calcularR(String label) {
        try {
            System.out.println();
            System.out.println(label + " = Ui / I");
            double Ui = lerDouble("Ui (V): ");
            double I = lerDouble("I (A): ");
            if (I == 0) {
                System.out.println("Erro: corrente não pode ser zero.");
                return;
            }
            double R = Ui / I;
            System.out.println();
            System.out.println(label + " = " + df.format(Ui) + " / " + df.format(I));
            System.out.println(label + " = " + df.format(R) + " Ω");
        } catch (InputMismatchException e) {
            limparScanner();
            System.out.println("Entrada inválida. Valores numéricos esperados.");
        }
    }

    private static void menuCalcularU() {
        System.out.println();
        System.out.println("1. Calcular U entre pontos (U)");
        System.out.println("2. Calcular Ui a partir de outros dados (exemplo)");
        System.out.print("Escolha uma opção: ");
        char opc = lerOpcao();
        switch (opc) {
            case '1' -> calcularU();
            default -> System.out.println("Opção de calcular U não implementada ou inválida.");
        }
    }

    private static void calcularU() {
        try {
            System.out.println();
            System.out.println("U = I * R");
            double I = lerDouble("I (A): ");
            double R = lerDouble("R (Ω): ");
            double U = I * R;
            System.out.println();
            System.out.println("U = " + df.format(I) + " * " + df.format(R));
            System.out.println("U = " + df.format(U) + " V");
        } catch (InputMismatchException e) {
            limparScanner();
            System.out.println("Entrada inválida. Valores numéricos esperados.");
        }
    }

    private static double lerDouble(String prompt) {
        System.out.print(prompt);
        while (true) {
            try {
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                limparScanner();
                System.out.print("Entrada inválida. Digite um número: ");
            }
        }
    }

    private static void limparScanner() {
        if (sc.hasNext()) sc.nextLine();
    }
}
