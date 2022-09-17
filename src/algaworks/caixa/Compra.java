package algaworks.caixa;

import algaworks.impressao.Imprimivel;
import algaworks.pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel {

    private String produto;
    private String nomeCliente;
    private double valorTotal;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public double getValorTotal() {
        return this.valorTotal;
    }

    @Override
    public String getCabecalhoPagina() {
        return this.getProduto() + " = " + this.getValorTotal();
    }

    @Override
    public String getCorpoPagina() {
        return this.getNomeCliente();
    }
}
