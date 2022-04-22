package abstracao.interfaces;

import java.util.ArrayList;
import java.util.List;

public interface Conta {
    
    void transferir(double valor , Conta conta_envio);

    void sacar(double valor);

    void depositar(double valor);

    String imprimir();

}
