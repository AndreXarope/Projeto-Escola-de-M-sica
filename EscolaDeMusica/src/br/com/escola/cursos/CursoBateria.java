package br.com.escola.cursos;

public class CursoBateria extends Curso {

	public CursoBateria() {
        super("Curso de Bateria", 5, 18);
    }

    @Override
    public void avaliar() {
        System.out.println("Avaliação prática: executar ritmo com metrônomo.");
    }
}
