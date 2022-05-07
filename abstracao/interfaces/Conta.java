package abstracao.interfaces;

// Dentro das interfaces existem somente assinaturas de métodos e propriedades, cabendo 
// à classe que a utilizará realizar a implementação das assinaturas, dando comportamentos 
// práticos aos métodos.

public interface Conta {;
    
    void transferir(double valor , Conta conta_envio);

    void sacar(double valor);

    void depositar(double valor);

    String imprimir();

}
