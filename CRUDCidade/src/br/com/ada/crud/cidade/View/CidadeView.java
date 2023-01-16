package br.com.ada.crud.cidade.View;

import br.com.ada.crud.cidade.Controler.CidadeController;
import br.com.ada.crud.cidade.Model.Cidade;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class CidadeView {

    private CidadeController controller;
    private Scanner scanner;

    public CidadeView(CidadeController controller, Scanner scanner) {
        this.controller = controller;
        this.scanner = scanner;
    }


    public void cadastrar(){
        Cidade cidade = new Cidade();

        System.out.println("Informe o nome da cidade: ");
        String nome = scanner.next();
        cidade.setNome(nome);

        System.out.println("Informe a data de fundacao da cidade no formato (dd/mm/aaaa)");
        String dataFundacao = scanner.next();
        cidade.setDataFundacao(LocalDate.parse(dataFundacao, DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("Informe o estado que a cidade pertence: ");
        String estado = scanner.next();
        cidade.setEstado(estado);




    }


    public void listarCidades (){
        List<Cidade> cidade = controller.listar();
        System.out.println("Numero| Nome | Estado | Data de Fundacao");
        for(int index = 0; index < cidade.size(); index++){
            System.out.println(index+1);
            exibirCidade(cidade.get(index));
        }

    }

    private void exibirCidade(Cidade cidade) {
        System.out.println(cidade.getNome());
        System.out.println(cidade.getEstado());
        System.out.println(cidade.getDataDeFundacao());
    }

    public void atualizarCidade(){}

    public void deletarCidade(){}

    public void Menu(){

        System.out.println("Informe a opcao desejada: 1 - cadastrar 2 - listar 3 - atualizar 4 - deletar 5 - sair");
        int opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                cadastrar();
                break;
            case 2:
                listarCidades();
                break;
            case 3:
                atualizarCidade();
                break;
            case 4:
                deletarCidade();
                break;
            case 5:
                System.out.println("Obrigado por utilizar nossos sistemas :)");
                System.exit(0);
                break;
            default:
                System.out.println("OPCAO INVALIDA !!!!!");
        }
        Menu();
    }
}
