package subsistema1.crm;

public class CrmService {

    private CrmService() {
        // Construtor privado para evitar instanciação da classe
    }

    /**
     * Grava informações do cliente no sistema de CRM.
     *
     * @param nome   Nome do cliente.
     * @param cep    CEP do cliente.
     * @param cidade Cidade do cliente.
     * @param estado Estado do cliente.
     * @throws IllegalArgumentException Se algum dos parâmetros for nulo ou vazio.
     */
    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        // Validação dos parâmetros de entrada
        if (nome == null || nome.isEmpty() || cep == null || cep.isEmpty() ||
                cidade == null || cidade.isEmpty() || estado == null || estado.isEmpty()) {
            throw new IllegalArgumentException("Todos os parâmetros são obrigatórios.");
        }

        // Construção da mensagem usando StringBuilder
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Cliente salvo no sistema de CRM:\n");
        mensagem.append("Nome: ").append(nome).append("\n");
        mensagem.append("CEP: ").append(cep).append("\n");
        mensagem.append("Cidade: ").append(cidade).append("\n");
        mensagem.append("Estado: ").append(estado).append("\n");

        // Saída da mensagem
        System.out.println(mensagem.toString());
    }
}
