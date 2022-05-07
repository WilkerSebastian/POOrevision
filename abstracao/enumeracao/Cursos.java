package abstracao.enumeracao;

// Declaração Enum

// Na declaração é definida uma classe chamada de tipo enum. 
// O corpo da classe enum pode incluir métodos e outros campos. 
// O compilador automaticamente adiciona alguns métodos especiais quando se cria um enum.

public enum Cursos {

    // como boa prática declaramos os valores enumericos com CAPS LOCK  

    INFO("informática"),
    MECA("mecânica"),
    ELETRO("elétrica");

    // Para iniciar os valores declarados dentro das variáveis Enum, é 
    // preciso declarar um construtor para iniciar os seus atributos que são declarados.

    private String curso;

    private Cursos(String curso) {

        this.curso = curso;

    }

    public String getCurso() {
        return curso;
    }
    
}
