package CRUD.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPG {

    public static Connection getConnection() throws SQLException {
    	try {
            // retornamos o parametros de conenexão com postgreSQL
            // atraves do metodo getConnection que está no driver 
            // e nesse método passamos o parametro de configuração do nosso postgreSQL
            // primeiro passamos uma String que tem a URL do nosso postgreSQL seguindo esse padrão 
            // "jdbc:postgresql://localhost/banco da dados"
            // segundo passamos uma String que tem nosso usuario do banco de dados "nome do usuario"
            // terceiro passsamos uma String que tem nossa senha do banco de dados "senha do banco de dados"
    		return DriverManager.getConnection("jdbc:postgresql://localhost/bdtlp","postgres", "postgres");

    	} catch (SQLException e) {

            // se tiver erro na conexão com postgreSQL mandar uma mensagem de erro
    		throw new SQLException(e.getMessage());
    	}
	}
    
}
