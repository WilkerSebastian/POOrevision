package abstracao.enumeracao;

public class MainEnum {
    
    public static void main(String[] args) {

        // toString() String retorna uma String com o nome da instância (em maiúsculas).

        System.out.println("toString: " + Cursos.MECA.toString());

        // valueOf(String nome)	static <T extends Enum<T>> T retorna o objeto da classe enum cujo nome é a string do argumento.

        System.out.println("valueOf: " + Cursos.valueOf("ELETRO"));

        // ordinal() int retorna o número de ordem do objeto na enumeração.

        System.out.println("ordinal: " + Cursos.INFO.ordinal());

        // usando método getter

        System.out.println("getter INFO: " + Cursos.INFO.getCurso());

    }

}
