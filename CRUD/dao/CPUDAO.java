package CRUD.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import CRUD.conexao.ConnectionPG;
import CRUD.modelo.CPU;

public class CPUDAO {
    
	// variavel que será a ponte em nosso banco de dados e a nossa aplicação
    private Connection conexao;

	// no seu cronstrutor passamos para a variavel conexao as especificações do postgresSQL atraves
	// do metodo estatico getConnection() da classe ConnectionPG
	public CPUDAO() throws SQLException {
		this.conexao = ConnectionPG.getConnection();
	}

	// metodo de inserção dos dados na tabela cpu
	public void adicionar(CPU cpu) throws SQLException {

		// String sql é o onde escreveremos o script SQL que usaremos
		String sql = "insert into cpu (nome, core , thread , clock_base, clock_turbo, \"TDP\", socket, data_lancamento, empresa, over, litografia , preco) VALUES (?,?,?,?, ?, ?, ?, ?, ?, ?, ?, ?)";

		// criamos um objeto de declaração preparada para executar o scrpit SQL que criamos
		PreparedStatement stmt = this.conexao.prepareStatement(sql);

		// dizemos para declaração preparada que o "?" na aparição 1  
		// será substituido por uma String que pegamos pelo metodo getNome do cpu
		// que foi passsado como parametro no metodo
		stmt.setString(1, cpu.getNome()); 

		// dizemos para declaração preparada que o "?" na aparição 2 e 3 
		// agora substituido por valores do tipo int
		stmt.setInt(2 , cpu.getCore());
		stmt.setInt(3 , cpu.getThread());

		// dizemos para declaração preparada que o "?" na aparição 4 e 5 
		// agora substituido por valores do tipo double
		stmt.setDouble(4, cpu.getClock_base());
        stmt.setDouble(5, cpu.getClock_turbo());

		// dizemos para declaração preparada que o "?" na aparição 6
		// denovo por int
        stmt.setInt(6 , cpu.getTDP());

		// dizemos para declaração preparada que o "?" na aparição 7
		// String novamente
        stmt.setString(7, cpu.getSocket());

		// dizemos para declaração preparada que o "?" na aparição 8
		// agora substituido por um valor Date SQL
        stmt.setDate(8, cpu.getDataLancamento());

		// dizemos para declaração preparada que o "?" na aparição 9
		// String novamente
        stmt.setString(9 , cpu.getEmpresa());

		// dizemos para declaração preparada que o "?" na aparição 10
		// agora substituido por um valor boolean
        stmt.setBoolean(10, cpu.isOver());

		// dizemos para declaração preparada que o "?" na aparição 11
		// denovo por int
		stmt.setInt(11 , cpu.getLitografia());

		// dizemos para declaração preparada que o "?" na aparição 12
		// denovo por double
        stmt.setDouble(12, cpu.getPreco());

		// agora que está tudo preparado mandamos a declaração preparada executar o script SQL conforme foi
		// especificado nas linhas anteriores
		stmt.execute();

		// apos a execução fechamos a declaração preparada
		// e finalizamos o metodo de inserção
		stmt.close();

	}

	// metodo de listagem que retorna uma List do CPU´s cadastrados por ordem de ID
	public List<CPU> listarcpu() throws SQLException {

		// ciramos o nosso ArrayList de CPU
		List<CPU> cpus = new ArrayList<CPU>();

		// String sql é o onde escreveremos o script SQL que usaremos
		String sql = "select * from cpu ORDER BY id";

		// criamos um objeto de declaração preparada que agora ira criar uma preparação 
		// para que assim executemos primeiro o script para depois tratamos os dados
		// recebidos 
		Statement stmt = this.conexao.createStatement();

		// criamos uma variavel que recebe o dados de retorno do script executado
		ResultSet resultSet = stmt.executeQuery(sql);

		// realizamos um ciclo while de que enquanto tiverem dados na
		// variavel que retorna o resultado do scirpt executado
		// o codico entre chaves estara sendo executado 
		while (resultSet.next()) {			

			// pegamos o dado da coluna id da tabela cpu e armazenamos numa variavel long id
			// atraves do resultSet.getLong("nome da tabela");
			long id = resultSet.getLong("id");

			// coluna nome
			String nome = resultSet.getString("nome");

			// coluna core
			int core = resultSet.getInt("core");

			// coluna thread
			int thread = resultSet.getInt("thread");

			// coluna clock_base
			double  base = resultSet.getDouble("clock_base");

			// coluna clock_turbo
            double  turbo = resultSet.getDouble("clock_turbo");

			// coluna TDP
            int TDP = resultSet.getInt("TDP");

			// coluna socket
            String socket = resultSet.getString("socket");

			// coluna data_lancamento
            Date data_lancamento = resultSet.getDate("data_lancamento");

			// coluna empresa
            String empresa = resultSet.getString("empresa");

			// coluna over
            boolean over = resultSet.getBoolean("over");

			// coluna litografia
			int litografia = resultSet.getInt("litografia");

			// coluna preco 
            double preco = resultSet.getDouble("preco");

			// apos coletamos os dados adicionamos ele no ArrayList atraves do cronstrutor do CPU
			cpus.add(new CPU(id , nome , core , thread , base , turbo , TDP , socket , data_lancamento , empresa , over , litografia , preco));
		}

		// apos a coleta de dados fechamos a declaração preparada
		stmt.close();

		// por fim retornamos o ArrayList como List
		return cpus;

	}
	
	// metodo de alterar tabela pelo id
	public void alterar(CPU cpu) throws SQLException {

		// String sql é o onde escreveremos o script SQL que usaremos
		String sql = "UPDATE cpu SET nome=?, core=? , thread=? , clock_base=?, clock_turbo=?, \"TDP\"=?, socket=?, data_lancamento=?, empresa=?, over=?, litografia=? ,preco=? WHERE id=?";


		// criamos um objeto de declaração preparada para executar o scrpit SQL que criamos
		PreparedStatement stmt = this.conexao.prepareStatement(sql);

		// dizemos para declaração preparada que o "?" na aparição 1  
		// será substituido por uma String que pegamos pelo metodo getNome do cpu
		// que foi passsado como parametro no metodo
		stmt.setString(1, cpu.getNome()); 

		// dizemos para declaração preparada que o "?" na aparição 2 e 3 
		// agora substituido por valores do tipo int
		stmt.setInt(2 , cpu.getCore());
		stmt.setInt(3 , cpu.getThread());

		// dizemos para declaração preparada que o "?" na aparição 4 e 5 
		// agora substituido por valores do tipo double
		stmt.setDouble(4, cpu.getClock_base());
        stmt.setDouble(5, cpu.getClock_turbo());

		// dizemos para declaração preparada que o "?" na aparição 6
		// denovo por int
        stmt.setInt(6 , cpu.getTDP());

		// dizemos para declaração preparada que o "?" na aparição 7
		// String novamente
        stmt.setString(7, cpu.getSocket());

		// dizemos para declaração preparada que o "?" na aparição 8
		// agora substituido por um valor Date SQL
        stmt.setDate(8, cpu.getDataLancamento());

		// dizemos para declaração preparada que o "?" na aparição 9
		// String novamente
        stmt.setString(9 , cpu.getEmpresa());

		// dizemos para declaração preparada que o "?" na aparição 10
		// agora substituido por um valor boolean
        stmt.setBoolean(10, cpu.isOver());

		// dizemos para declaração preparada que o "?" na aparição 11
		// denovo por int
		stmt.setInt(11 , cpu.getLitografia());

		// dizemos para declaração preparada que o "?" na aparição 12
		// denovo por double
        stmt.setDouble(12, cpu.getPreco());

		// dizemos para declaração preparada que o "?" na aparição 13
		// esse é a posicção da interrogação do where="?" que é essencial na busca
		// pela tabela pelo getId do CPU 
		stmt.setLong(13, cpu.getId());

		// agora que está tudo preparado mandamos a declaração preparada executar o script SQL conforme foi
		// especificado nas linhas anteriores
		stmt.execute();

		// apos a execução fechamos a declaração preparada
		// e finalizamos o metodo de inserção
		stmt.close();
	}
	
	// metodo de deletar tabela CPU pelo ID
	public void apagar(Long id) throws SQLException {

		// String sql é o onde escreveremos o script SQL que usaremos
		String sql = "delete from cpu where id=?";

		// criamos um objeto de declaração preparada para executar o scrpit SQL que criamos
		PreparedStatement stmt = this.conexao.prepareStatement(sql);

		// dizemos para declaração preparada que o "?" na aparição 1  
		// será substituido por um long que pegamos pelo id 
		// que foi passsado como parametro no metodo asssim 
		// realizando a nossa procura pela tabela com id = ao que foi
		// passado no metodo
		stmt.setLong(1, id);

		// agora que está tudo preparado mandamos a declaração preparada executar o script SQL conforme foi
		// especificado nas linha anterior
		stmt.execute();

		// apos a execução fechamos a declaração preparada
		// e finalizamos o metodo de inserção
		stmt.close();
	}

}
