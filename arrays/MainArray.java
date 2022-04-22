package arrays;

import java.util.ArrayList;
import java.util.List;

public class MainArray {

    public static void main(String[] args) {

        // aviso array padrões são pouco usado na pratica pois temos formas melhores de
        // criar Arrays
        // como vai ver na sessão abaixo

        // Array padrões

        // Os arrays ou matrizes, como são conhecidos pelo Java, fazem parte do pacote
        // java.util
        // na coleção da API do Java. São objetos de recipientes que contém um número
        // fixo de
        // valores de um único tipo. O comprimento de um array é estabelecido quando
        // criado,
        // sendo que após a criação o seu comprimento fica fixo.

        // [] - são inseridos em uma variável que referecia um array
        int[] a = new int[4];
        // OUTRA MANEIRA DE FAZER UMA DECLARAÇÃO DE ARRAY
        int[] b;
        b = new int[10];
        // DECLARANDO VÁRIOS ARRAYS
        int[] r = new int[44], k = new int[23];

        // {} - inicializar valores em um array sua declaração
        int[] iniciaValores = { 12, 32, 54, 6, 8, 89, 64, 64, 6 };

        // DECLARA UM ARRAY DE INTEIROS
        int[] meuArray;

        // ALOCA MEMÓRIA PARA 10 INTEIROS
        meuArray = new int[10];

        // INICIALIZA O PRIMEIRO ELEMENTO
        meuArray[0] = 100;
        meuArray[1] = 85;
        meuArray[2] = 88;
        meuArray[3] = 93;
        meuArray[4] = 123;
        meuArray[5] = 952;
        meuArray[6] = 344;
        meuArray[7] = 233;
        meuArray[8] = 622;
        meuArray[9] = 8522;
        // meuArray [10] = 564; //ESTOURA A PILHA POIS NÃO EXISTE O ÍNDICE 10

        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);

        // ##########################################################################################################################################################################################//

        // ArrayList

        // Uma coleção indexada de objetos às vezes chamada de sequência. Como nos
        // vetores, índices de List
        // são baseados em zero, isto é, o índice do primeiro elemento é zero. Além dos
        // métodos herdados
        // de Collection, List fornece métodos para manipular elementos baseado na sua
        // posição (ou índice)
        // numérica na lista, remover determinado elemento, procurar as ocorrências de
        // um dado elemento e
        // percorrer sequencialmente (ListIterator) todos os elementos da lista. A
        // interface List é implementada
        // por várias classe, incluídas as classes ArrayList (implementada como vetor),
        // LinkedList e Vector.

        // nesse exemplo usaremos uma ArrayList que é forma mais usada de Array

        ArrayList<String> lista = new ArrayList<String>(); // <String> definimos que sera uma lista de objetos de String

        // void add(Object element): Adiciona o elemento especificado no final da lista.

        lista.add("eae bro!");

        // void add(int index, Object element): Insere o elemento especificado na
        // posição indicada da lista.

        lista.add(1 , "salve bro!");

        // Object get(int index): Retorna o i-ésimo elemento da lista.

        System.out.println("get 0: " + lista.get(0));
        System.out.println("get 5: " + lista.get(1));

        // usando um foreach para ler uma lista
        for (String elemento : lista) {

            System.out.println("usando for each com arraylist: " + elemento);

        }

        // void clear(): Remove todos os elementos da lista.

        lista.clear();

        // boolean isEmpty(): Retorna verdadeiro se a lista estiver vazia e falso caso
        // contrário.

        if (lista.isEmpty()) {

            System.out.println("lista vazia");

        } else {

            System.out.println("lista não está vazia");

        }

        // boolean contains(Object element): Retorna verdadeiro se a lista contém o
        // elemento especificado e falso caso contrário.

        lista.add("to mais de boa!");

        if (lista.contains("to mais de boa!")) {

            System.out.println("lista tem esse elemento");

        } else {

            System.out.println("lista não tem esse elemento");

        }

        // int indexOf(Object element): Retorna a posição da primeira ocorrência do
        // elemento especificado na lista.

        // para esse vamos usar uma lista de integer

        ArrayList<Integer> listaInt = new ArrayList<Integer>();

        listaInt.add(4);
        listaInt.add(4);
        listaInt.add(5);
        listaInt.add(68);
        listaInt.add(9);

        System.out.println("posição: " + listaInt.indexOf(5));

        // int lastIndexOf(Object element): Retorna a posição da última ocorrência do
        // elemento especificado na lista.

        System.out.println("posição: " + listaInt.indexOf(4));

        // Object remove(int index): Remove o elemento da lista pela posição.

        listaInt.remove(4);

        // Object set(int index, Object element): Substitui o elemento da lista pela posição.

        listaInt.set(0, 69);
        
        // int size(): Retorna o número de elementos da lista.

        int soma = 0;

        for (int x = 0;x < listaInt.size();x++) {
            
            soma += listaInt.get(x);

        }

        System.out.println("A media da lista int é " + (soma / listaInt.size()));

    }
}