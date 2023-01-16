package br.com.ada.crud.cidade.Controler.IMPL;

import br.com.ada.crud.cidade.Controler.CidadeController;
import br.com.ada.crud.cidade.Model.Cidade;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.*;


public class CidadeArmazenamentoVolatilController implements CidadeController{

        private Map<UUID, Cidade> cidades = new HashMap<>();

        @Override
        public void cadastrar(Cidade cidade) {
            cidade.setId(UUID.randomUUID());
            cidades.put(cidade.getId(), cidade);
        }

    @Override
    public Cidade listarCidades(UUID id) {
        Cidade encontrada = cidades.get(id);
        return encontrada;
    }

    @Override
    public List<Cidade> listar() {

        return new ArrayList<>(cidades.values());
    }


}
