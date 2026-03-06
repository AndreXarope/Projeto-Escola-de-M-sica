package br.com.escola.cursos;

public class CursoGuitarra extends Curso {

	public CursoGuitarra() {
        super("Curso de Guitarra", 6, 20);
    }

    @Override
    public void avaliar() {
        System.out.println("Avaliação prática: tocar solo de rock.");
    }

}
