package exemplos.menu;

import java.util.ArrayList;
import java.util.Scanner;

public class exemploMenu {

    public static void main(String[] args) {

        ArrayList<Double> valores = new ArrayList<Double>();
        
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print(
                "\n\n\n1) adicioonar valor" + 
                "\n2) remover valor" + 
                "\n3) alterar valor" +
                "\n4) listar valor" +
                "\n5) sair"+
                "\n\n escolha: " 
            );

            byte escolha = input.nextByte();

            switch (escolha) {
                case 1:

                        System.out.print("\n\nInforme o valor que deseja adicionar: ");
                        valores.add(input.nextDouble());
                    
                    break;
                case 2:

                        System.out.print("\n\nInforme o valor que deseja remover: ");
                        double busca = input.nextDouble();

                        valores.remove(valores.indexOf(busca));
                    
                    break;
                case 3:

                        System.out.print("\n\nInforme o valor que deseja alterar: ");
                        double index = input.nextDouble();

                        System.out.print("\n\nInforme o novo valor: ");
                        double alteracao = input.nextDouble();

                        valores.set(valores.indexOf(index), alteracao);
                    
                    break;
                case 4:

                        System.out.println("\n\nLista de valores\n");
                        for (Double valor : valores) {
                            System.out.printf("\nvalor: %.2f",valor);
                        }

                    break;
                case 5:

                        System.out.println("\n\nFinalizado!\n");
                        return;

                default:
                    System.out.println("input falho!");
                    break;
            }
            
        }

    }
    
}
