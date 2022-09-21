package algaworks.caixa;

import algaworks.impressao.Impressora;
import algaworks.pagamento.Cartao;
import algaworks.pagamento.Operadora;

public class Checkout {
    
    private Operadora operadora;
    private Impressora impressora;

    public Checkout (Operadora operadora, Impressora impressora){
        this.operadora = operadora;
        this.impressora = impressora;
    }

    public void fecharCompra(Compra compra, Cartao cartao){
        boolean autorizado = this.operadora.autorizar(compra,cartao);
        if (autorizado) {
            this.impressora.imprimir(compra);
        } else {
            System.out.println("Pagamento negado");
        }
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }

    public Impressora getImpressora() {
        return impressora;
    }

    public void setImpressora(Impressora impressora) {
        this.impressora = impressora;
    }
}
