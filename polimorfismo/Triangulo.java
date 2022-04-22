package polimorfismo;

public class Triangulo extends Poligino{

    // O super() serve para chamar o construtor da superclasse. 
    // Ele sempre é chamado, mesmo quando não está explícito no código, quando 
    // for explicitado deve ser o primeiro item dentro do construtor.

    public Triangulo(int altura, int largura, int lado, int quant_lados) {
        super(altura, largura, lado, quant_lados);
        
    }

    // A Sobrescrita de Métodos pode ser classificada como polimorfismo de inclusão.
    // Quando um método sobrescreve um método herdado de uma classe, temos uma sobrescrita de método. 
    // Este método de sobrescrita tem que ser idêntico ao método da classe herdada, ou seja, 
    // eles precisam ter o mesmo nome, valor de retorno e argumentos. Portanto, temos que uma classe 
    // filha fornece apenas uma nova implementação para o método herdado e não um novo método.

    @Override
    public int area() {
        
        return (this.getLados() * this.getAltura() / 2);

    }

    // Se a classe filha fornecer um método de cabeçalho ou assinatura parecida com a do método 
    // herdado (difere ou no número ou no tipo dos argumentos) então não se trata mais de redefinição, 
    // trata-se de uma sobrecarga, pois criou-se um novo método. Uma chamada ao método herdado 
    // não mais será interceptada por esse novo método de mesmo nome

    public int area(double base , double h){

        return (int) Math.floor((base * h) / 2);

    }

}
