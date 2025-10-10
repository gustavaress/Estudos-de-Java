package br.com.fiap.sistemapassagens.view;

import br.com.fiap.sistemapassagens.model.Passageiro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Passageiros Loucos ===");

        // Instanciando scanner
        Scanner sc = new Scanner(System.in);

        //Perguntas
        System.out.println(" ");
        System.out.println("Cadastrando Passageiro...");
        System.out.println("Digite o nome do passageiro: ");
        String nomePassageiro = sc.nextLine();
        System.out.println("Digite a idade do passageiro: ");
        int idadePassageiro = sc.nextInt();

        Passageiro passageiro = new Passageiro(nomePassageiro, idadePassageiro);
        boolean menorDeIdadePassageiro;
        passageiro.setMaiorDeIdade(passageiro.verificarMaiorDeIdade(idadePassageiro));

        System.out.println("Passageiro " + passageiro.getNome() + " cadastrado com sucesso!");
        System.out.println("Idade: " + passageiro.getIdade() + " anos -" + " Maior de idade: " + passageiro.getMaiorDeIdade());


    }
}
