package lista_um.calculadora;

import java.util.Scanner;

public class Calculos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        int n1 = scanner.nextInt();
        System.out.println("Informe o segundo numero: ");
        int n2 = scanner.nextInt();
        System.out.println("Informe a operação: ");
        String operacao = scanner.next();
        System.out.println(n1 + " " + operacao + " " + n2 + " = " + calcular(n1, n2, operacao));
    }

    private static int calcular(int n1, int n2, String op){
        return switch (op) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            default -> n1 / n2;
        };
    }
}
