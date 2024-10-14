package lista_um.manipulacao_strings;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Manipulacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com uma frase");
        String frase = scanner.nextLine();
        System.out.println("Entre com uma palavra que você quer trocar na frase: ");
        String palavraVelha = scanner.next();
        System.out.println("Entre com uma nova palavra");
        String palavraNova = scanner.next();
        fazerManipulacoes(frase, palavraVelha, palavraNova);
    }

    private static void fazerManipulacoes(String frase, String velha, String nova){
        System.out.println("A frase contem (" + frase.length() + ") caracteres");
        System.out.println("Tudo MAIUSCULO = " + frase.toUpperCase());
        System.out.println("Tudo minusculo = " + frase.toLowerCase());
        System.out.println("Nova frase = " + frase.replace(velha, nova));
        trocarCaracteresInvalidos(frase);
    }

    private static void trocarCaracteresInvalidos(String frase){

        var str = frase.replace("ç", "c").replace("é", "e").replace("ê", "e");
        System.out.println(str);
    }

}
