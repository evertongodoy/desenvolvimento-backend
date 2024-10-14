package lista_dois;

public class TestadoraPedido {

    public static void main(String[] args) {
        PedidoService p = new PedidoService(new ConsoleRelatorioService());
        p.criarRelatorio();
    }
}
