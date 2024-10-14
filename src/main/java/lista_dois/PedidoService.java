package lista_dois;

public class PedidoService {
    RelatorioService relatorioService;

    public PedidoService(RelatorioService relatorioService){
        this.relatorioService = relatorioService;
    }

    public void criarRelatorio(){
        relatorioService.gerarRelatorio();
    }
}
