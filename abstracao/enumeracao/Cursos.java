package abstracao.enumeracao;

public enum Cursos {

    INFO("informática"),
    MECA("mecânica"),
    ELETRO("elétrica");

    private String curso;

    private Cursos(String curso) {

        this.curso = curso;

    }

    public String getCurso() {
        return curso;
    }
    
}
