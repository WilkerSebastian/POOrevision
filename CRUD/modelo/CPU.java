package CRUD.modelo;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

// Aqui é a classe que terá seus dados salvos no banco de dados
public class CPU {

    private long id; // na tabela será o id serial
    private String nome; // na tabela será nome character varying(100)
    private int core; // na tabela será core integer
    private int thread; // na tabela será thread integer
    private double clock_base; // na tabela será clock_base numeric
    private double clock_turbo; // na tabela será clock_turbo numeric
    private int TDP; // na tabela será TDP integer
    private String socket; // na tabela será socket character varying(10)
    private Date data_lancamento; // na tabela será data_lancamento date
    private String empresa; // na tabela será empresa character varying(5)
    private boolean over; // na tabela será over boolean
    private int litografia; // na tabela será litografia integer
    private double preco; // na tabela será preco numeric

    public CPU(){

    }


    public CPU(long id, String nome, int core, int thread, double clock_base, double clock_turbo, int TDP,String socket, Date data_lancamento, String empresa, boolean over, int litografia, double preco) {
        this.id = id;
        this.nome = nome;
        this.core = core;
        this.thread = thread;
        this.clock_base = clock_base;
        this.clock_turbo = clock_turbo;
        this.TDP = TDP;
        this.socket = socket;
        this.data_lancamento = data_lancamento;
        this.empresa = empresa;
        this.over = over;
        this.litografia = litografia;
        this.preco = preco;
    }


    public Date getDataLancamento() {
        return data_lancamento;
    }

    // metodo desenvolvido por Wilker de conversão de String para Date SQL
    public void setDataLancamento(String data_lancamento) {

        // criando o formato de data que será usado no caso dia/mes/ano
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		
        // criamos um objeto do Date Util
		java.util.Date dataUtil;
		
		dataUtil = new java.util.Date();
		
		try {
            // pegamos a string que foi passada como parametro do metodo
            // e convetemos ela pro formato que especificamos
            // e passamos para para variavel dataUtil
			dataUtil = formatoData.parse(data_lancamento);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
        // agora dizemos que a data_lancamento da classe será
        // um objeto Date SQL e que terá seu cronstrutor a data
        // armazenada do dataUtil atraves do metodo getTime()
        
		this.data_lancamento = new Date(dataUtil.getTime());
		
	}



    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }
    public long getId() {
        return id;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getSocket() {
        return socket;
    }
    public void setSocket(String socket) {
        this.socket = socket;
    }
    public int getTDP() {
        return TDP;
    }
    public void setTDP(int TDP) {
        this.TDP = TDP;
    }
    public double getClock_turbo() {
        return clock_turbo;
    }
    public void setClock_turbo(double clock_turbo) {
        this.clock_turbo = clock_turbo;
    }
    public double getClock_base() {
        return clock_base;
    }
    public void setClock_base(double clock_base) {
        this.clock_base = clock_base;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public int getThread() {
        return thread;
    }

    public void setThread(int thread) {
        this.thread = thread;
    }

    public int getLitografia() {
        return litografia;
    }

    public void setLitografia(int litografia) {
        this.litografia = litografia;
    }
    
    
}
