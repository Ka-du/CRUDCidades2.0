package br.com.ada.crud.cidade.Controler;

import br.com.ada.crud.cidade.Model.Cidade;

import java.util.List;
import java.util.UUID;

public interface CidadeController {

    void cadastrar(Cidade cidade);

    Cidade listarCidades(UUID id);

    List<Cidade> listar();
}
