package br.com.escola.factory;

import br.com.escola.cursos.*;

public class CursoFactory {

	public static Curso criarCurso(String tipo) throws Exception {
        switch (tipo.toLowerCase()) {
            case "guitarra": return new CursoGuitarra();
            case "piano": return new CursoPiano();
            case "bateria": return new CursoBateria();
            default:
                throw new Exception("Tipo de curso inválido!");
        }
    }
}
