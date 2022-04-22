package abstracao.interfaces;

import java.util.ArrayList;

public class Maininter {
    
    public static ArrayList<Conta> contas = new ArrayList<Conta>();
    public static void main(String[] args) {

        Conta_comun wilker = new Conta_comun("wilker", 1000);

        Conta_comun samuel = new Conta_comun("samuel", 2000);

        System.out.println(wilker.getId());

        contas.add(0 , wilker);

        contas.add(1 , samuel);

        wilker.transferir(500, samuel);

        for (Conta c : contas) {

            System.out.print(c.imprimir() + "\n\n");
            
        }
        

    }

}
