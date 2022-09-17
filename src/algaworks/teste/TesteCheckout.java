package algaworks.teste;

import algaworks.caixa.Checkout;
import algaworks.caixa.Compra;
import algaworks.impressao.Impressora;
import algaworks.impressao.impressoras.ImpressoraEpson;
import algaworks.impressao.impressoras.ImpressoraHP;
import algaworks.pagamento.Cartao;
import algaworks.pagamento.Operadora;
import algaworks.pagamento.operadoras.Cielo;
import algaworks.pagamento.operadoras.MasterCard;

public class TesteCheckout {
    public static void main(String[] args) {

        Operadora operadora = new Cielo();
        Impressora impressora = new ImpressoraEpson();

        Cartao cartao = new Cartao();
        cartao.setNomeTitular("Joao M Couves");
        cartao.setNumeroCartao("123");

        Compra compra = new Compra();
        compra.setNomeCliente("Joao Mendonca Couves");
        compra.setProduto("sabonete");
        compra.setValorTotal(2.5);

        Checkout checkout = new Checkout(operadora, impressora);
        checkout.fecharCompra(compra, cartao);

        System.out.println("---------------");

        Cartao cartao1 = new Cartao();
        cartao1.setNomeTitular("Maria");
        cartao1.setNumeroCartao("123553"); //cartao deve terminar com 543

        Compra compra1 = new Compra();
        compra1.setNomeCliente("Maria M");
        compra1.setProduto("cerveja");
        compra1.setValorTotal(5.0);

        MasterCard mc = new MasterCard();
//        mc.autorizar(compra1, cartao1);

        ImpressoraHP hp = new ImpressoraHP();

        Checkout ck = new Checkout(mc,hp);
        ck.fecharCompra(compra1,cartao1);
    }
}
