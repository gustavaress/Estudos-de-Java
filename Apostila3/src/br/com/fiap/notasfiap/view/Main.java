package br.com.fiap.notasfiap.view;

import br.com.fiap.notasfiap.model.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CALCULADORA DE NOTAS FIAP ===");

        // Instanciando Scanner
        Scanner sc = new Scanner(System.in);

        //Pedindo informações ao usuario
        System.out.println("Digite o nome do aluno:");
        String alunoNome = sc.nextLine();

        System.out.println("Qual o RM do aluno?");
        int alunoRm = sc.nextInt();

        // Instanciando Aluno
        Aluno aluno = new Aluno(alunoNome, alunoRm);

        System.out.println("Aluno " + aluno.getNome() + " - RM" + aluno.getRm() + " cadastrado com sucesso!");

        // Pedindo as informações das provas ao usuario
        System.out.println("Digite a nota do aluno no Checkpoint 1:");
        double notaCp1 = sc.nextDouble();

        System.out.println("Digite a nota do aluno no Checkpoint 2:");
        double notaCp2 = sc.nextDouble();

        System.out.println("Digite a nota do aluno no Checkpoint 3:");
        double notaCp3 = sc.nextDouble();

        System.out.println("Digite a nota do aluno na Sprint 1 do Challange:");
        double notaSp1 = sc.nextDouble();

        System.out.println("Digite a nota do aluno na Sprint 2 do Challange:");
        double notaSp2 = sc.nextDouble();

        System.out.println("Digite a nota do aluno na Global Solution:");
        double notaGS = sc.nextDouble();
        double menor;

        if (notaCp1 < notaCp2 && notaCp1 < notaCp3) {
            menor = notaCp1;
        } else if (notaCp2 < notaCp1 && notaCp2 < notaCp3) {
            menor = notaCp2;
        } else if (notaCp3 < notaCp1 && notaCp3 < notaCp2) {
            menor = notaCp3;
        } else {
            menor = 0;
        }

        double mediaCp = (notaCp1 + notaCp2 + notaCp3 - menor) / 2;
        double mediaSp = (notaSp1 + notaSp2) / 2;
        double mediaSemestre = (mediaCp * 0.2) + (mediaSp * 0.2) + (notaGS * 0.6);

        System.out.println(" === NOTA MÉDIA SEMESTRAL ===");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("RM: " + aluno.getRm());
        System.out.println("Nota Checkpoint: " + mediaCp);
        System.out.println("Nota Challange: " + mediaSp);
        System.out.println("Nota Global Solution: " + notaGS);
        System.out.println("Média do Semestre: " + mediaSemestre);
    }
}