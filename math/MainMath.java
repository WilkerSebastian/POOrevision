package math;

public class MainMath {

    public static void main(String[] args) {

        // essa é a Classe Math 
        // public final class Math extends Object

        // A classe Math contém métodos para realizar operações numéricas básicas, como exponencial elementar, 
        // logaritmo, raiz quadrada e funções trigonométricas.

        // "E" é uma variavel double que está mais próximo do valor "E" que uma base usada nós logaritmos naturais.
        System.out.println("variavel E: " + Math.E);

        // PI é uma variavel double que está mais próximo de
        // PI, que é usada na razão entre a circunferência de um círculo e seu diâmetro
        System.out.println("variavel PI: " + Math.PI);

        // função max(double a , double b)
        // Retorna o maior de dois valores.

        int valor1 = 15;
        int valor2 = 5;

        System.out.println("o maior entre " + valor1 + " e " + valor2 + ": " + Math.max(valor1, valor2));

        // função min(double a , double b)
        // Retorna o menor de dois valores.

        System.out.println("o menor entre " + valor1 + " e " + valor2 + ": " + Math.min(valor1, valor2));

        // função random()
        // Retorna um valor double com sinal positivo, maior ou igual 0.0e menor que 1.0.

        System.out.println("retorna o valor aleatorio: " + Math.random());

        double numMAX = 11;
        // para ter um número aletaorio entre 0 e algum valor, vamos multiplicar random por um valor
        // e esse valor será o maximo que esse valor - 1.Por isso colocamos o maximo com valor 11
        //para conseguimos ter um valor aleatorio entre 0 a 11

        System.out.println("retorna o valor aleatorio de 0 a " + (numMAX - 1) + ": " + (int)(Math.random() * numMAX)); 

        // função abs(double a), 
        // retorna o valor absoluto de um valor númerico seja (double, float, int, long).
        
        double numeroComVirgula = 3.46776;
        System.out.println("valor absoluto de " + numeroComVirgula + " dividido por 2: " + Math.abs(numeroComVirgula / 2));
        
        // função pow(double a . double b)
        // Retorna o valor do primeiro argumento elevado à potência do segundo argumento.

        double potencia = 3;

        numeroComVirgula = 3;

        System.out.println("número " + numeroComVirgula + " elevado a " + potencia + ": " + Math.pow(numeroComVirgula, potencia));

        // função sqrt(double a)
        // Retorna a raiz quadrada positiva corretamente arredondada de um valor double.

        numeroComVirgula = 16;

        System.out.println("valor raiz quadrada de " + numeroComVirgula + ": " + Math.sqrt(numeroComVirgula));

        // função cbrt(double a)
        // Retorna a raiz cúbica de um valor double.

        numeroComVirgula  = 27;

        System.out.println("valor raiz cubica de " + numeroComVirgula + ": " + Math.cbrt(numeroComVirgula));

        // função cill(double a)
        // Retorna o menor valor (mais próximo do infinito negativo) de uma valor double
        // é maior ou igual ao argumento e é igual a um inteiro matemático.

        // na pratica o que ele faz é arredodar pra cima um número com virgula

        numeroComVirgula = 3.5;

        System.out.println("valor arredondado pra cima de " + numeroComVirgula + ": " + Math.ceil(numeroComVirgula));

        // função floor(double a)
        // Retorna o maior valor (mais próximo do infinito positivo) de uma valor double
        // é maior ou igual ao argumento e é igual a um inteiro matemático.

        // na pratica o que ele faz é arredodar pra baixo um número com virgula

        System.out.println("valor arredondado pra baixo de " + numeroComVirgula + ": " + Math.floor(numeroComVirgula));

        // função toRadians(double angdeg)
        // Converte um ângulo medido em graus em um ângulo aproximadamente equivalente medido em radianos.

        numeroComVirgula = 30;

        System.out.println("valor em radiano do angulo " + numeroComVirgula + ": " + Math.toRadians(numeroComVirgula));

        // funcões cos(double a) , sin(double a) , tan(double a)
        // Retorna o cosseno , seno , tangente trigonométrico de um ângulo respectivamente.

        System.out.println("valor do cosseno do angulo " + numeroComVirgula + ": " + Math.cos(Math.toRadians(numeroComVirgula)));
        System.out.println("valor do seno do angulo " + numeroComVirgula + ": " + Math.sin(Math.toRadians(numeroComVirgula)));
        System.out.println("valor da tangente do angulo " + numeroComVirgula + ": " + Math.tan(Math.toRadians(numeroComVirgula)));

        // função round(double a)
        // Retorna o comprimento mais próximo do argumento, com laços arredondados para infinito positivo.

        // na pratica se o valor pós casa decimal for maior que 4 ele arredonda pra cima
        // ou se o valor pós casa decimal for menor que 5 ele arrendonda pra baixo

        numeroComVirgula = 3.5;

        System.out.println("round do valor " + numeroComVirgula + ": " + Math.round(numeroComVirgula));

        numeroComVirgula = 3.4;

        System.out.println("round do valor " + numeroComVirgula + ": " + Math.round(numeroComVirgula));

        // função log(double a)
        // Retorna o logaritmo natural (base e ) de um valor double.

        numeroComVirgula = Math.pow(Math.E, 10);

        System.out.println("log natural do valor " + numeroComVirgula + ": " + Math.log(numeroComVirgula));

        // função log10(double a)
        // Retorna o logaritmo de base 10 de um valor double.

        numeroComVirgula = 100;

        System.out.println("log de base 10 do valor " + numeroComVirgula + ": " + Math.log10(numeroComVirgula));

    }
    
}