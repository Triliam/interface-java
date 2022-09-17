package algaworks.pagamento.operadoras;

import algaworks.pagamento.Autorizavel;
import algaworks.pagamento.Cartao;
import algaworks.pagamento.Operadora;

public class MasterCard implements Operadora {

    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return autorizavel.getValorTotal() < 500 && cartao.getNumeroCartao().endsWith("543");
    }
}
