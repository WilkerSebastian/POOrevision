package variaveis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Vari {
    public static void main(String[] args) {
        
        //String é um objeto que armazena caracteres

        //você pode ou não declarar String como objeto

        String exemplo = "samuel esfirra"; 

        String objString = new String("cria");

        System.out.println("quantos caracteres tem objString: " + objString.length()); // .length() retorna um int com as quantidades de caracteres de uma String

        if (exemplo.equals(objString)) {// equals(Object anObject) recebe um objeto como uma String como argumento e retorna verdadeiro ou falso

            System.out.printf("\n%s : %s são iguais",exemplo,objString);// se equals der true os objetos/String são iguais
            
        } else {
            
            System.out.printf("\n%s : %s são diferentes",exemplo,objString);// se equals der false significa que os objetos/String são diferentes

        }

        if ("wilker".equalsIgnoreCase("WILKER")) {// equalsIgnoreCase(Object anObject) recebe um objeto como uma String como argumento e retorna verdadeiro ou falso, mas ignorando se a letra é maiúsculas ou minúsculas 

            System.out.println("\nigual!");
            
        } else {
            
            System.out.println("diferente!");

        }

        if ("o samhero é juuj!".compareTo("samuel é dono do samuel esfirras!") > 0) {
            // compareTo(String anootaion) recebe uma String é retrona -1
            // retornar 0 se as strings forem iguais, um número negativo se a string que invoca o compareTo 
            // for menor que a string que é passada como um argumento e um número positivo se a string 
            // que invoca o compareTo for maior que a string que é passada como argumento.

            //existe também o compareToIgnoreCase que faz a mesma coisa só que ignorando maiúsculas e minúsculas
         
            System.out.println("samuel é dono do samuel esfirras! é maior que o samhero é juuj!");

        }

        // Existem duas formas de unir duas ou mais sequências de caracteres. A mais comum dentre elas é utilizando o operador de adição, como demonstra o

        String nome = "rei delas";
        String sobrenome = "2005";

        String nick = nome + sobrenome;

        System.out.println("o nick: " + nick);

        // a outra forma

        String _nick = nome.concat(sobrenome);

        System.out.println("o nick da segunda forma: " + _nick);

        // valueOf é um método estático da classe String, que não precisa de uma instância para ser invocado. 
        // Ele converte um tipo primitivo em um objeto do tipo String.

        double numero = 0.465776;

        String numeroS = String.valueOf(numero);

        System.out.println(numeroS);

        // charAt retorna o caractere em uma localização específica em uma String. Esse método possui um parâmetro do tipo inteiro que é usado
        // como índice, retornando a partir dessa posição inserida nesse parâmetro. É importante lembrar que o índice sempre começa
        // a ser contado do número 0 em diante

        String siis = "C++ supremacy";

        System.out.println("charAT(0) = " + siis.charAt(4));

        // indexOf localiza a primeira ocorrência de um caractere em uma string. Se o método localizar o caractere, é retornado o índice do 
        // caractere na String, caso contrário retorna -1. Existem duas versões do indexOf que procuram caracteres em uma String.

        System.out.println("indice: " + siis.indexOf('p'));

        // substring permite extrair substrings de strings e fornece 2 métodos substring para permitir que um novo objeto seja criado copiando parte de um 
        // objeto string existente. Cada método retorna um novo objeto desse tipo. Existem duas versões desse método que são:

        System.out.println("substring: " + siis.substring(0, 2));

        // replace retorna um novo objeto contendo a string original com um trecho especificado substituído por outra expressão indicada. Esse método deixa a string 
        // original inalterada. A versão sobrecarregada do método replace permite substituir substrings em vez de caracteres individuais.

        System.out.println("replace: " + siis.replace('C', 'P'));

        // toUpperCase retorna uma nova string com o conteúdo da original convertido para letras maiúsculas, mantendo a original inalterada.

        System.out.println("toUpperCase: " + siis.toUpperCase());

        // toLowerCase de forma semelhante ao anterior, o toLowerCase retorna uma cópia de uma string com todas as letras 
        // convertidas para minúsculo, mantendo a original inalterada.

        System.out.println("toLowerCase: " + "ALEXANDRA".toLowerCase());

        // trim gera um novo objeto string, removendo todos os caracteres de espaço em branco que aparecem no início ou no fim da string em que 
        // o método opera. 
        // O método retorna um novo objeto string contendo a string sem espaço em branco inicial ou final. A string original permanece inalterada.

        String f = "F E R R A Z";
        System.out.println("trim: " + f.trim());

        // toCharArray um novo array de caracteres que contém uma cópia dos caracteres da variável apontada.

        char arrayChar[] = siis.toCharArray();

        for (char a : arrayChar) {

            System.out.print(a);

        }

//##########################################################################################################################################################################################//

        // tipos múmericos

        // inetiros

        byte bit = 120; // byte armazena números de -128 a 127
        System.out.println("\nbyte: " + bit);
        short curto = 2324; // short armazena números de -32.768 a 32.767
        System.out.println("byte: " + curto);
        int inteiro = 424872334; // int armazena de 
        System.out.println("byte: " + inteiro);
        long longo = 9223372036854775807L; // vai de 9 e uma porrada de números negativos a 9 e uma cacetada de números
        System.out.println("byte: " + longo);

        // ponto flutuante

        float folat32 = 4234.5657F; // float armazena números entre -1.4024E - 37 a 3.40282347E + 38
        System.out.println("float: " + folat32);
        double float64 = 4274937294723394276344.47354365863456345; // double armazena números entre -4.94E - 307 a 1.79769313486231570E + 308
        System.out.println("double: " + float64);

//##########################################################################################################################################################################################//

        // tipo bool

        // essa variavel só armazena estados que no caso são verdadeiro e falso

        boolean real_ou_feike = true;
        System.out.println("Real ou Feike: " + real_ou_feike);

        real_ou_feike = false;
        System.out.println("Real ou Feike: " + real_ou_feike);

//##########################################################################################################################################################################################//

        // tipo char

        char letra = 'w'; // armazena um caractere
        System.out.println("char: " + letra);

//##########################################################################################################################################################################################//

        // As variaveis com tipo primitivo tem sua versão objeto que serve para manipulações 
        //mais complexas como conversão de tipos e uso de ArrayList etc...

        String objCHAR; // a versão do objeto do tipo primitivo char

        Byte objBYTE; // a versão do objeto do tipo primitivo byte

        Short objSHORT; // a versão do objeto do tipo primitivo short

        Integer objINT; // a versão do objeto do tipo primitivo int

        Long objLONG; // a versão do objeto do tipo primitivo long

        Float objFLOAT; // a versão do objeto do tipo primitivo float

        Double objDOUBLE; // a versão do objeto do tipo primitivo double

        Boolean objBOOL; // a versão do objeto do tipo primitivo boolean

        // exemplo de uso para conveter string para int

        System.out.println(Integer.parseInt("26"));

        // outro uso também é para incializamos um valor mas passar nehum especificação

        Double dinheiro = null;

        if (dinheiro == null) {
            
            System.out.println("você não iniciou sua conta!");

        }

        // se fossemos usar tipo primitov daria pois precisariamos incializar com valor

        double dinheiro2 = 0;

        // double dinhiro == null dar erro

        if (dinheiro2 == 0) {

            System.out.println("você não iniciou sua conta.");
            
        }

//##########################################################################################################################################################################################//

        // tipo date util

        // data representa o tempo, um tempo é composto por ano, mês, dia atual, minuto atual, entre outras propriedades 
        // que essa classe possui.

        // Mas como colocar uma data digitada pelo usuário em uma variável Date? 
        // Temos que usar conversores. A classe java.text.SimpleTextFormat() nos servirá:

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        // criar uma especificação de formato no 
        // nesse caso (dia/mês/ano)

        Date data = new Date();

        try { // execeção caos ocorra erro na passagem de argumentos do date
            data = formato.parse("05/10/2009"); // passamos uma string e o SimpleDateFormat atraves do parse converte para Date
            System.out.println("data:" + formato.format(data)); // mosta a data no forma especificado pelo cronstutor

        } catch (ParseException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        // exemplo de input no bloco abaixo


//##########################################################################################################################################################################################//

        // input

        Scanner input = new Scanner(System.in); // define que input vai receber argumentos do terminal

        String string = input.nextLine(); //lê a String até o primeiro enter mais indicada para String
        char letras = input.next().charAt(0); // lê a String até o primeiro espaço mais indicada para char
        byte idade = input.nextByte(); // retorna número como byte
        short curtinho = input.nextShort(); // retorna número como short
        int valor = input.nextInt(); // retorna número como int
        long id = input.nextLong(); // retorna número como long
        float centavos = input.nextFloat(); // retorna numero como float
        double grana = input.nextDouble(); // retorna numero como double
        boolean ativo = input.nextBoolean(); // retorna estado como boolean

        try {// execeção caos ocorra erro do input do date

            Date hoje = formato.parse(input.nextLine()); // retorna uma string que é convertida para Date no formato especificado

        } catch (ParseException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
}