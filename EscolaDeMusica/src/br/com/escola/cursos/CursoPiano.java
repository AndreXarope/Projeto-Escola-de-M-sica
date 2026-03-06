package br.com.escola.cursos;

public class CursoPiano extends Curso {

	public CursoPiano() {
        super("Curso de Piano", 8, 15);
    }

    @Override
    public void avaliar() {
        System.out.println("Avaliação prática: tocar peça clássica.");
    }
}
