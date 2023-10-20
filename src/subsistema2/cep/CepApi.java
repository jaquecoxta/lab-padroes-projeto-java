package subsistema2.cep;

public class CepApi {

    private static final String CIDADE_PADRAO = "Araraquara";
    private static final String ESTADO_PADRAO = "SP";
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }
    public String recuperarCidade(String cep) {
        // Lógica para recuperar a cidade associada ao CEP
        // Capturar exceções, se houver, e tratar adequadamente
        try {
            // ...
        } catch (Exception e) {
            // Logar o erro ou retornar uma mensagem de erro amigável
            return "Erro ao recuperar a cidade para o CEP fornecido.";
        }
        return CIDADE_PADRAO;
    }
    public String recuperarEstado(String cep) {
        // Lógica para recuperar o estado associado ao CEP
        // Capturar exceções, se houver, e tratar adequadamente
        try {
            // ...
        } catch (Exception e) {
            // Logar o erro ou retornar uma mensagem de erro amigável
            return "Erro ao recuperar o estado para o CEP fornecido.";
        }
        return ESTADO_PADRAO;
    }
}
