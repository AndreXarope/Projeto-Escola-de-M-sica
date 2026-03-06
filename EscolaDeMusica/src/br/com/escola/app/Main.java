package br.com.escola.app;

import java.util.Scanner;

import br.com.escola.cursos.Curso;
import br.com.escola.factory.CursoFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

        try {
            System.out.println("Qual curso deseja iniciar? (guitarra / piano / bateria):");
            String tipo = input.nextLine();

            Curso curso = CursoFactory.criarCurso(tipo);

            curso.iniciarCurso();
            curso.avaliar();
            curso.encerrarCurso();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        input.close();
	}

}
