package abstracao.interfaces;

import java.util.ArrayList;

// para usar a iterface numa classe usamos o "implements" seguido do nome da interface
// o que obriga a classe a usar os métodos da interface

public class Conta_comun implements Conta{

    public static ArrayList<Integer> ids = new ArrayList<Integer>();
    private String nome;
    private double valor;
    private int id;

    public Conta_comun(String nome , double valor) {
        
        // criamos um id que é um número aletorio de até 6 digitos
        int id = (int) (Math.random() * Math.pow(10 , 6));

        // verificamos se o ArrayList não está vazio
        if (!ids.isEmpty()) {
         
            // fazemos um ciclo while que repete enqunato não fornecemos um id não repitido
            while (verificarID(id)){ 

                // passamos outro valor aleatorio de até 6 digitos para o id
                id = (int) (Math.random() * Math.pow(10 , 6));
    
            }

        }

        // adicionamos o id no ArrayList de ids
        ids.add(id);
        
        // atribuinos a variavel id ao atributo id da classe Conta_comun
        this.id = id;

        setNome(nome);
        setValor(valor);

    }

    // método para ver se ja existe um id cadastrado
    public boolean verificarID(int id){

        boolean existe = false;

        for (Integer id_existente : ids) {

            if (id_existente == id) {

                existe = true;
                
            }
            
        }

        return existe;

    }

    // método transferir que somos obrigados a sobrescrever da interface Conta
    @Override
    public void transferir(double valor , Conta conta_envio){

        if (valor <= this.valor && conta_envio != null) {
         
            this.sacar(valor);

            conta_envio.depositar(valor);

        }else{

            System.out.println("\nerro na transferencia");

        }
        
    }

    // método sacar que somos obrigados a sobrescrever da interface Conta
    @Override
    public void sacar(double valor) {

        if (valor <= this.valor) {
         
            this.valor -= valor;

        }else{

            System.out.println("\nerro ao sacar");

        }
        
    }

    // método depositar que somos obrigados a sobrescrever da interface Conta
    @Override
    public void depositar(double valor) {
        
        this.valor += valor;
        
    }

    // método imprimir que somos obrigados a sobrescrever da interface Conta
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
