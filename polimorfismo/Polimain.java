package polimorfismo;

public class Polimain {

    public static void main(String[] args) {
        
        Poligino quadrao = new Poligino(5 , 5 , 5 , 4);
        
        Triangulo triangulo = new Triangulo(5, 5, 5, 3);

        System.out.println("Area do quadrado: " + quadrao.area());

        System.out.println("Area do triangulo com sobrescrita: " + triangulo.area());

        System.out.println("Area do triangulo com sobrecarga: " + triangulo.area(4.5 , 2.25));

    }
    
}
