package ciclo_repeticao;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class Ciclomain {

    public static void main(String[] args) {

        //O for é uma estrutura de repetição na qual seu ciclo será executado por um tempo 
        //ou condição pré-determinados e em uma quantidade de vezes que determinamos.

        // A variável de controle, que chamamos de "i", tem seu valor inicial como 0;
        // No segundo bloco, onde escrevemos "i < 10", estamos dizendo que o conteúdo do 
        // for será executado enquanto o valor de i for menor ou igual a 10;
        // Com o terceiro bloco definido como "i++"", estamos dizendo que, no fim de cada 
        // execução do for, o conteúdo de "i" será incrementado em 1 unidade. Isso quer dizer que, 
        // no fim da primeira execução, i irá de 0 para 1; na segunda execução, irá de 1 para 2, e 
        // assim por diante;
        // Com isso, o conteúdo do for será executado por 10 vezes, já que o i é iniciado em 0. 
        // A saída do código acima mostra que a mensagem foi escrita por 10 vezes, onde o "i" 
        // variou de 0 até 9.
        // Um ponto importante sobre o for é que, por causa da utilização 
        // da variável de controle, geralmente ele é utilizado quando sabemos exatamente 
        // quantas vezes queremos repetir a execução do trecho de código

        for (int i = 0; i < 10; i++) {
            
            System.out.println("A variável i: " + i);

        }

        // O while também é uma estrutura de repetição, assim como o for. 
        // A diferença entre ambas é que, enquanto usamos o for quando geralmente 
        // conhecemos a quantidade de vezes que o trecho de código deverá ser repetido, nós 
        // utilizamos o while quando não sabemos exatamente quantas vezes o código será repetido.
        // O while possui a seguinte estrutura:

        // while de equanto o numero não for multiplo de 2

        int numero = 157;

        while (numero % 2 == 0) { 
           
            System.out.println("numero: " + numero);

            numero /= 2;

        }

        System.out.println("numero: " + numero);

        // do while é a mesma coisa só que ele ele faz e depois verifica a condição do while

        int num = 0;

        System.out.println("num antes do \"do while\" " + num);

        do {

            num++;

            System.out.println("num no \"do while\" " + num);
            
        } while (num != 4);

        System.out.println("num depois do \"do while\" " + num);

        // FOREACH

        // Uso de loop for aprimorado
        // Podemos usar o loop for aprimorado para iterar os elementos da coleção abaixo:

        // Ordem
        // Lista de Matriz
        // Mapa
        // conjunto
        // LinkedList e assim por diante.



        // Vantagens do loop ForEach

        // Fácil de recuperar todos os elementos em uma matriz ou coleção
        // O código é mais legível
        // Não funciona em nenhuma condição ou expressão booleana
        // Menos possibilidade de bugs ou erros.



        // Desvantagens do loop ForEach

        // Não é possível recuperar elementos com base em um índice
        // Não é possível atravessar na ordem inversa
        // Não é possível modificar os valores dos elementos da matriz



        // Sintaxe do loop ForEach

        // for(tipo_da_variavel nome_do_receptor : array) {
        //     
        //
        //
        // }

        // tipo_da_variavel - tipo de dados da matriz ou lista de coleção
        
        // nome_do_receptor - variável de loop
        
        // array - matriz ou coleção

        // exemplo pratico

        double[] vetor = {0.09 , 4.1 , 6.7 , 5.3  , 3.14};

        for (double receptor : vetor) {
            
            if (receptor == 3.14) {
                
                System.out.println("receptor tem uma valor que é igual PI");

            }

        }

    }

}
