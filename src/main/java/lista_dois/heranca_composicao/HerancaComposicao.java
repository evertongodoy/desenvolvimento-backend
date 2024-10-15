package lista_dois.heranca_composicao;

public class HerancaComposicao {

    public static void main(String[] args) {
        System.out.println("Dados da moto");
        Moto m = new Moto();
        m.marca = "marca da moto";
        m.modelo = "modelo da moto";
        m.ligar(); // Da Veiculo
        m.buzinar(); // Do Moto

        System.out.println("");
        System.out.println("Dados da motor");
        Motor mt = new Motor("tipo-motor", 1000);
        System.out.println(mt);

        System.out.println("");
        System.out.println("Dados do carro");
        Carro c = new Carro();
        c.marca = "marca do carro";
        c.modelo = "modelo do carro";
        c.ano = 1550;
        c.motor = mt;
        System.out.println(c);
    }

}
