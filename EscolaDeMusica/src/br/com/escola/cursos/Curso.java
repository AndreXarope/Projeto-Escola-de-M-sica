package br.com.escola.cursos;

import br.com.escolas.interfaces.IGestaoCurso;

public abstract class Curso implements IGestaoCurso {

	private String nome;
	private int duracao;
	private int numeroAlunos;
	
	public Curso(String nome, int duracao, int numeroAlunos) {
		super();
		this.nome = nome;
		this.duracao = duracao;
		this.numeroAlunos = numeroAlunos;
	}
	
	// ENCAPSULAMENTO: getters e setters controlam o acesso
    public String getNome() { return nome; }
    public int getDuracao() { return duracao; }
    public int getNumeroAlunos() { return numeroAlunos; }

    public void setNumeroAlunos(int numeroAlunos) { this.numeroAlunos = numeroAlunos; }

    // Métodos comuns
    @Override
    public void iniciarCurso() {
    	System.out.println("\n===== INÍCIO DO CURSO =====");
        System.out.println("Curso: " + getNome());
        System.out.println("Duração: " + getDuracao() + " meses");
        System.out.println("Número de alunos: " + getNumeroAlunos());
        System.out.println("==========================\n");
    }

    @Override
    public void encerrarCurso() {
        System.out.println("" + nome + " encerrado.");
    }

    // Método POLIMÓRFICO → será implementado diferente em cada curso
    @Override
    public abstract void avaliar();
}

