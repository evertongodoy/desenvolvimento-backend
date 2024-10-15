package lista_dois.heranca_composicao;

public class Motor {
    public String tipo;
    public Integer potencia;

    public Motor(String tipo, Integer potencia){
        this.tipo = tipo;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tipo='" + tipo + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
