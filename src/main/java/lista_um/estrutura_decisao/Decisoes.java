package lista_um.estrutura_decisao;

import java.util.Scanner;

public class Decisoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma idade: ");
        int idade = scanner.nextInt();
        while(idade < 0 || idade > 120){
            System.out.println("Idade invalida, digite idade entre 0 a 120: ");
            idade = scanner.nextInt();
        }
        if(idade < 18){
            System.out.println("Pessoa menor de idade");
        } else if (idade > 65) {
            System.out.println("Pessoa idosa");
        } else {
            System.out.println("Pessoa adulta");
        }
    }
}
