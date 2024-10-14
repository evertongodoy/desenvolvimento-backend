package lista_dois.heranca_composicao;

public class Veiculo {

    public String marca;
    public String modelo;

    public void ligar(){
        System.out.println("O veiculo está ligado");
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

}