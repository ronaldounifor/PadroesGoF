public class App {
    public static void main(String[] args) throws Exception {
        VendaFacade fachada = new VendaFacade();

        fachada.iniciarVenda();
        fachada.adicionarProdutos(0, 2);
        fachada.getTotal();
        fachada.getDetalhes(2);
    }
}
