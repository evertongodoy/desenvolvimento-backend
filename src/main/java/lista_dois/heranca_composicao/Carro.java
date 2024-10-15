package lista_dois.heranca_composicao;

import java.util.Scanner;

public class Carro {

    private String marca;
    private String modelo;
    private Integer ano;
    private Motor motor;

    public static void main(String[] args) {
        var carro = new Carro().cadastrarCarro();
        var motor = new Carro().cadastrarMotor();
        System.out.println("------------------");
        carro.acelerar();
        carro.frear();
        carro.exibirDados(carro);
        motor.exibirDadosMotor(motor);
    }

    private Carro cadastrarCarro(){
        System.out.println("******** Cadastre seu Carro ********");
        System.out.println(" Digite a marca: ");
        Carro c = new Carro();
        Scanner scanner = new Scanner(System.in);
        c.marca = scanner.next();
        System.out.println(" Digite a modelo: ");
        c.modelo = scanner.next();
        System.out.println(" Digite o ano: ");
        c.ano = scanner.nextInt();
        return c;
    }

    public Motor cadastrarMotor(){
        System.out.println("******** Cadastre seu Motor ********");
        System.out.println(" Digite o tipo: ");
        var tipo = new Scanner(System.in).next();
        System.out.println(" Digite a potencia: ");
        var potencia = new Scanner(System.in).nextInt();
        return new Motor(tipo, potencia);
    }

    private void acelerar(){
        System.out.println("O carro está acelerando");
    }
    private void frear(){
        System.out.println("O carro está freando");
    }
    private void exibirDados(Carro carro){
        System.out.println(carro.toString());
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }

}