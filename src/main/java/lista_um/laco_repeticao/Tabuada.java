package lista_um.laco_repeticao;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tabuada de qual numero ?");
        int num = scanner.nextInt();
        for(int multiplicador = 0; multiplicador <= 10; multiplicador++){
            System.out.println(num + " * " + multiplicador + " = " + multiplicador * num);
        }
    }
}
