package polimorfismo;

public class Poligino {

    private int altura;
    private int largura;
    private int lado;
    private int quant_lados;

    public Poligino(int altura, int largura , int lado , int quant_lados) {

        super(); // definiminos que essa é classe pai principal das classes que herdam dela

        this.altura = (int) Math.floor(altura);
        this.largura = (int) Math.floor(largura);
        this.lado = (int) Math.floor(lado);
        this.quant_lados = quant_lados;

        if (quant_lados < 3) {
            
            quant_lados = 3;

        }
    }

    public int area(){

        return this.largura * this.altura;

    }

    public int perimetro(){

        return (int) Math.sqrt(this.lado);

    }

    public int grau_interno(){

        return (this.quant_lados - 2) * 180;

    }


    public int getLados() {
        return lado;
    }

    public void setLados(int lado) {
        this.lado = lado;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getQuant_lados() {
        return quant_lados;
    }

    public void setQuant_lados(int quant_lados) {
        this.quant_lados = quant_lados;
    }
    
}