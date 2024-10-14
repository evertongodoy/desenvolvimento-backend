package lista_dois.heranca_composicao;

public class Moto extends Veiculo {

    public void buzinar(){
        System.out.println("A moto está buzinando");
    }

    public static void main(String[] args) {
        Moto moto = new Moto();
        moto.marca = "Honda";
        moto.modelo = "CB 500";
        moto.ligar();
        moto.buzinar();
    }

}