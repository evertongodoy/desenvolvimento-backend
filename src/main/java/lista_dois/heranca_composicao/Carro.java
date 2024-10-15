package lista_dois.heranca_composicao;

import java.util.Scanner;

public class Carro extends Veiculo {

    public Integer ano;
    public Motor motor;

    @Override
    public String toString() {
        return "Carro{" +
                "ano=" + ano +
                ", motor=" + motor +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}