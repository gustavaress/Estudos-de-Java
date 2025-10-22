package br.com.fiap.textanaliser.view;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Word Analiser ===");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        System.out.println("Digite uma outra palavra: ");
        String palavra2 = sc.nextLine();

        System.out.println("Quantidade de letras: " + palavra.length());
        System.out.println("Primeira letra: " + palavra.charAt(0));
        System.out.println("Ultima letra: " + palavra.charAt(palavra.length() - 1));
        System.out.println("Vogal 'I' substituída: " + palavra.replace('i', 'o'));
        System.out.println("Termina com O? " + palavra.endsWith("o"));
        System.out.println("Palavra 1 e 2 são iguais? " + palavra.equals(palavra2));
    }
}
