package br.com.ada.crud.cidade.Controler.IMPL;

import br.com.ada.crud.cidade.Controler.CidadeController;
import br.com.ada.crud.cidade.Model.Cidade;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.*;


public class CidadeArmazenamentoVolatilController implements CidadeController{

        private Map<UUID, Cidade> pessoas = new HashMap<>();

        @Override
        public void cadastrar(Cidade cidade) {
            cidade.setId(UUID.randomUUID());
            pessoas.put(cidade.getId(), cidade);
        }

}
