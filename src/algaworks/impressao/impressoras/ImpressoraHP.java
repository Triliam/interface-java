package algaworks.impressao.impressoras;

import algaworks.impressao.Impressora;
import algaworks.impressao.Imprimivel;

public class ImpressoraHP implements Impressora {
    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println("impressao feita na HP");
        System.out.println(imprimivel.getCabecalhoPagina());
        System.out.println(imprimivel.getCorpoPagina());
        System.out.println("---------------------");
    }
}
