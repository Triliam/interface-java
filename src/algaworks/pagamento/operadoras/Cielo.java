package algaworks.pagamento.operadoras;

import algaworks.pagamento.Autorizavel;
import algaworks.pagamento.Cartao;
import algaworks.pagamento.Operadora;

public class Cielo implements Operadora {
    
    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("123") && autorizavel.getValorTotal() < 100;
    }
}
