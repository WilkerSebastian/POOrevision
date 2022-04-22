package abstracao.interfaces;

import java.util.Random;

public class Conta_comun implements Conta{

    private int id = 0;
    private String nome;
    private double valor;

    public Conta_comun(String nome , double valor) {
        
        Random aleatio = new Random();

        this.id = aleatio.nextInt();

        if (id < 0) {
            
            this.id *= -1;

        }
        setNome(nome);
        setValor(valor);

    }

    @Override
    public void transferir(double valor , Conta conta_envio){

        if (valor <= this.valor && conta_envio != null) {
         
            this.sacar(valor);

            conta_envio.depositar(valor);

        }else{

            System.out.println("erro na traferencia");

        }
        
    }

    @Override
    public void sacar(double valor) {
        
        this.valor -= valor;
        
    }

    @Override
    public void depositar(double valor) {
        
        this.valor += valor;
        
    }

    @Override
    public String imprimir() {
        
        return "\nid: " + Integer.toString(id) +
               "\nnome: " + this.nome +
               "\nvalor: " + Double.toString(valor);

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
