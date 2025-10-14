package br.com.fiap.view;

import br.com.fiap.model.Elevador;

import javax.xml.transform.Source;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Instanciando elevador
        Elevador elevador = new Elevador();
        Scanner sc = new Scanner(System.in);

        elevador.inicializa(5, 7);

        int escolha;

        do {
            System.out.println("Bem vindo ao elevador da FIAP!");
            System.out.println("1. Adicionar uma pessoa.");
            System.out.println("2. Remover uma pessoa.");
            System.out.println("3. Subir um andar.");
            System.out.println("4. Descer um andar.");
            System.out.println("5. Exibir informações.");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção:");

            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    elevador.entra();
                    System.out.println("Numero de pessoas atual: " + elevador.getNumeroPessoas());
                    System.out.println(" ");
                    break;
                case 2:
                    elevador.sai();
                    System.out.println("Numero de pessoas atual: " + elevador.getNumeroPessoas());
                    System.out.println(" ");
                    break;
                case 3:
                    elevador.sobe();
                    System.out.println("Numero do andar atual: " + elevador.getAndarAtual());
                    System.out.println(" ");
                    break;
                case 4:
                    elevador.desce();
                    System.out.println("Numero do andar atual: " + elevador.getAndarAtual());
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("Andar atual: " + elevador.getAndarAtual());
                    System.out.println("Numero de pessoas atual: " + elevador.getNumeroPessoas());
                    System.out.println("Capacidade máxima: " + elevador.getCapacidade());
                    System.out.println("Número de andares: " + elevador.getTotalAndares());
                    System.out.println(" ");
                    break;
                case 0:
                    System.out.println("Finalizando programa...");
                    System.out.println(" ");
                    sc.close();
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("Opção não reconhecida...");
                    System.out.println(" ");
            }
        } while (escolha != 0);

        sc.close();
    }
}