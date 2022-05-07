package abstracao.interfaces;

import java.util.ArrayList;

public class Maininter {
    public static void main(String[] args) {

        // !AVISO não se declara Interface como exemplo: Conta conta = new Conta()
        // pois ela serve apenas para ser implementada em uma Classe

        // criamos um ArrayList de Conta podendo armaszenar qualquer classe que 
        // implemente a interface Conta
        ArrayList<Conta> contas = new ArrayList<>();

        // criamos uma conta comun
        Conta_comun wilker = new Conta_comun("wilker", 1000);

        // criamos outra conta comun
        Conta_comun samuel = new Conta_comun("samuel", 2000);

        // adicionamos wilker no ArrayList contas
        contas.add(0 , wilker);

        // adicionamos samuel no ArrayList contas
        contas.add(1 , samuel);

        // testamos se não conseguimos sacar um valor maior que o que tem em conta
        wilker.sacar(1200);

        // testamos o saque para zerar a conta wilker
        wilker.sacar(1000);

        // testamos fazer uma transferencia errada
        samuel.transferir(5000, wilker);

        // testamos a transferimos 500 do samuel para wilker
        samuel.transferir(500, wilker);

        // testamos o depositar
        samuel.depositar(2000);

        // testamos o método imprimir das contas
        for (Conta c : contas) {

            System.out.print(c.imprimir() + "\n\n");
            
        }

    }

}
