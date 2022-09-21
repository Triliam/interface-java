package algaworks.impressao.impressoras;

import algaworks.impressao.Impressora;
import algaworks.impressao.Imprimivel;

public class ImpressoraEpson implements Impressora {
    
    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println("*****************");
        System.out.println(imprimivel.getCabecalhoPagina());
        System.out.println("*****************");
        System.out.println(imprimivel.getCorpoPagina());
        System.out.println("*********EPSON********");
    }
}
