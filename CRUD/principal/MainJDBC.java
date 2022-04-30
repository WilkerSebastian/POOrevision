package CRUD.principal;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import CRUD.dao.CPUDAO;
import CRUD.modelo.CPU;

public class MainJDBC {

    // AVISO!

    // para testar essa aplicação é necessario ter no seu postgreSQL
    // um banco de dados bdtlp e nele uma tabela cpu cujo o script
    // de criação da tabela cpu está na pasta sql com nome do arquivo
    // sendo "CPU.sql"

    // como estaremos lindando com uma grande quantidade de dados no input
    // estamos utilizando uma metodo de evitar sobrecarga no buffer do input
    // que envolve todo input ser nextLine(), mas usando objetos dos tipos
    // primitivos para conveter para o tipo que queremos. Exemplo abaixo com tipo int
    //      
    //  int valorInteiro = Integer.parseInt(input.nextLine());
    //

    // colocamos execessão na função main para cuidar do possiveis erros da conexão 
    // com o postgresSQL
    public static void main(String[] args) throws SQLException {

        // criando um Scanner para pegar o input do terminal
        Scanner input = new Scanner(System.in);

        // criando objeto que criamos para manipular a tabela cpu
        CPUDAO tabela_cpu = new CPUDAO();

        // variavel para escolhas do nosso menu
        byte escolha;

        // id que usaremos dentro do switch
        long id;

        // ciclo infinito do menu
        while (true) {

            // menu do CRUD
            System.out.print("\n\n\nCadastro CPU "
                    + "\n\n 1) adicionar CPU"
                    + "\n 2) deletar CPU"
                    + "\n 3) alterar CPU"
                    + "\n 4) listar CPU"
                    + "\n 5) sair"
                    + "\n\nEscolha: ");

            // pegamos a escolha do usuario
            escolha = Byte.parseByte(input.nextLine());

            // vemos qual foi a escolha
            switch (escolha) {

                // adicionar CPU
                case 1:

                    // criamos um cpu para inserimos na tabela
                    CPU cpuINSERT = new CPU();

                    System.out.print("\n\n\nInforme o nome do CPU: ");
                    cpuINSERT.setNome(input.nextLine());

                    System.out.print("\nQuantos nucleos físicos tem CPU: ");
                    cpuINSERT.setCore(Integer.parseInt(input.nextLine()));

                    System.out.print("\nQuantos nucleos lógicos tem CPU: ");
                    cpuINSERT.setThread(Integer.parseInt(input.nextLine()));

                    System.out.print("\nInforme o clock base do CPU(GHz): ");
                    cpuINSERT.setClock_base(Double.parseDouble(input.nextLine()));

                    System.out.print("\nInforme o clock turbo do CPU(GHz): ");
                    cpuINSERT.setClock_turbo(Double.parseDouble(input.nextLine()));

                    System.out.print("\nInforme o TDP do CPU(W): ");
                    cpuINSERT.setTDP(Integer.parseInt(input.nextLine()));

                    System.out.print("\nInforme o socket do CPU: ");
                    cpuINSERT.setSocket(input.nextLine());

                    System.out.print("\nInforme a data de lançamento do CPU com formato dd/MM/yyyy: ");
                    cpuINSERT.setDataLancamento(input.nextLine());

                    System.out.print("\nInforme o nome da empresa do CPU: ");
                    cpuINSERT.setEmpresa(input.nextLine());

                    System.out.print("\nO CPU tem suporte a over clock (sim/nao): ");

                    // pegamos o input ignorando se a String é igual a sim independente se tem letra maiúscula
                    if (input.nextLine().equalsIgnoreCase("sim")) {

                        // se o usuario digitar sim dizemos que é verdadeiro que o
                        // cpu tem surpote a overclock
                        cpuINSERT.setOver(true);

                    } else {

                        // se o usuario digitar algo diferente de sim dizemos que é falso que o
                        // cpu tem surpote a overclock
                        cpuINSERT.setOver(false);

                    }

                    System.out.print("\nQual a litografia do CPU (nm): ");
                    cpuINSERT.setLitografia(Integer.parseInt(input.nextLine()));

                    System.out.print("\nQual o preço do CPU: R$");
                    cpuINSERT.setPreco(Double.parseDouble(input.nextLine()));

                    // adicionamos o nosso cpu que criamos na tabela cpu
                    tabela_cpu.adicionar(cpuINSERT);

                    break;
                
                // deletar cpu
                case 2:

                    // pegamos o id pra buscamos a tabela que iremos deletar
                    System.out.print("\n\n\nInforme o ID do CPU que deseja deletar: ");
                    id = Long.parseLong(input.nextLine());

                    // buscamos pelo id que pegamos no input e passamos para o metodo apagar
                    // assim deletando a tabela especificada
                    tabela_cpu.apagar(id);

                    break;

                // alterar cpu
                case 3:


                    // criamos o novo cpu de substituição
                    CPU cpuALTER = new CPU();

                    System.out.print("\n\n\nInforme o ID do CPU que deseja deletar: ");
                    cpuALTER.setId(Long.parseLong(input.nextLine()));

                    System.out.print("\nInforme o nome do CPU: ");
                    cpuALTER.setNome(input.nextLine());

                    System.out.print("\nQuantos nucleos físicos tem CPU: ");
                    cpuALTER.setCore(Integer.parseInt(input.nextLine()));

                    System.out.print("\nQuantos nucleos lógicos tem CPU: ");
                    cpuALTER.setThread(Integer.parseInt(input.nextLine()));

                    System.out.print("\nInforme o clock base do CPU(GHz): ");
                    cpuALTER.setClock_base(Double.parseDouble(input.nextLine()));

                    System.out.print("\nInforme o clock turbo do CPU(GHz): ");
                    cpuALTER.setClock_turbo(Double.parseDouble(input.nextLine()));

                    System.out.print("\nInforme o TDP do CPU(W): ");
                    cpuALTER.setTDP(Integer.parseInt(input.nextLine()));

                    System.out.print("\nInforme o socket do CPU: ");
                    cpuALTER.setSocket(input.nextLine());

                    System.out.print("\nInforme a data de lançamento do CPU com formato dd/MM/yyyy: ");
                    cpuALTER.setDataLancamento(input.nextLine());

                    System.out.print("\nInforme o nome da empresa do CPU: ");
                    cpuALTER.setEmpresa(input.nextLine());

                    System.out.print("\nO CPU tem suporte a over clock (sim/nao): ");

                    // pegamos o input ignorando se a String é igual a sim independente se tem letra maiúscula
                    if (input.nextLine().equalsIgnoreCase("sim")) {

                        // se o usuario digitar sim dizemos que é verdadeiro que o
                        // cpu tem surpote a overclock
                        cpuALTER.setOver(true);

                    } else {

                        // se o usuario digitar algo diferente de sim dizemos que é falso que o
                        // cpu tem surpote a overclock
                        cpuALTER.setOver(false);

                    }

                    System.out.print("\nQual a litografia do CPU (nm): ");
                    cpuALTER.setLitografia(Integer.parseInt(input.nextLine()));

                    System.out.print("\nQual o preço do CPU: R$");
                    cpuALTER.setPreco(Double.parseDouble(input.nextLine()));

                    // passamos o novo para o metodo alterar(cpu) que ira substituir os valores
                    //  do cpu com mesmo id do nvo cpu criado
                    tabela_cpu.alterar(cpuALTER);

                    break;
                    
                // listar CPU
                case 4:

                    // criamos uma List de cpu que recebe como parametro a lista de cpu`s
                    // da tabrla pelo metodo listarcpu()
                    List<CPU> cpus = tabela_cpu.listarcpu();

                    System.out.println("\n\n\nLISTA de CPU´s");

                    // fazemos um forEach com o cpus e imprimos os valores deles
                    for (CPU cpu : cpus) {
                        
                        System.out.println("\n\nid: " + cpu.getId() 
                        + "\nnome: " + cpu.getNome()
                        + "\nNº de núcleos: " + cpu.getCore()
                        + "\nNº de threads: " + cpu.getThread()
                        + "\nclock base: " + cpu.getClock_base() + " GHz"
                        + "\nclock turbo: " + cpu.getClock_turbo() + " GHz"
                        + "\nTDP: " + cpu.getTDP() + " W"
                        + "\nsocket: " + cpu.getSocket()
                        + "\ndata lançamento: " + cpu.getDataLancamento().toString()
                        + "\nover clock: " + cpu.isOver()
                        + "\nempresa: " + cpu.getEmpresa()
                        + "\nlitografia: " + cpu.getLitografia() + " nm"
                        + "\npreço: R$" + cpu.getPreco());

                    }

                    break;
                // sair
                case 5:

                    // dizemos tchau e encerramos a função principal
                    System.out.println("\n\nfinalizando...\n");
                    return;

                // se não for nenhum dos casos dizemos para o usuario
                // que ele forneceu uma escolha invalida
                default:

                    System.out.println("\n\\Escolha invalida!\n");
                    break;
            }

        }

    }

}
