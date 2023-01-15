package br.com.ada.crud.cidade.Controler;

import br.com.ada.crud.cidade.Controler.IMPL.CidadeArmazenamentoVolatilController;

public class CidadeControllerFactory {

    public CidadeController criar(CidadeArmazenamentoTipo tipo) {
        if (tipo == CidadeArmazenamentoTipo.VOLATIL) {
            return (CidadeController) new CidadeArmazenamentoVolatilController();
        } else {
            throw new RuntimeException("Nenhuma implementação disponível");
        }
    }

}
