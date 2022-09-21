package algaworks.pagamento;

public class Cartao {

    private String nomeTitular;
    private String numeroCartao;

    public String getNomeTitular() {
        return this.nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public String getNumeroCartao() {
        return this.numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
