package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//import com.mysql.cj.protocol.Resultset;

public class DB {

	//Cria��o de um tipo Connection do java.sql
		private static Connection conn = null;
		//Cria��o do m�todo que estabelece a conex�o
		public static Connection getConnection() {
			// Se a conex�o n�o existir criaremos uma
			if (conn == null) {
				
				//https://docs.oracle.com/javase/10/docs/api/java/util/Properties.html
				/*
				 * Declara��o do objetos props a fim de 
				 * pegar um conjunto persistente de propriedades
				 * que no nosso caso ser� propriedades de um arquivo
				 * Assim, faremos isto por meio de um m�todo criados 
				 * por n�s mesmos. 
				 **/
				// o m�todo loadProperties nos retornar� um objeto Properties 
				//props capaz de ler um fluxo de dados que nosso caso ser� um arquivo
				Properties props = loadProperties();
				//Salvaremos uma c�pia do valor pela chave(nome) denominada dburl do arquivo que criamos db.properties 
				String url = props.getProperty("dburl");
				try {
					//Atribuimos a conn (declarado mais acima) uma conexao com 
					//o MySQL e o banco de dados atrav�s da Classe DriverManager
					conn = DriverManager.getConnection(url, props);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					//Tratamento da exce��o
					throw new DbException(e.getMessage());
				}
				}
			//Retorno da conex�o
			return conn;
		}
		/*
		 * o m�todo loadProperties nos retornar� um objeto Properties 
		props capaz de ler um fluxo de dados que nosso caso ser� um arquivo			
		 * 
		 */
		private static Properties loadProperties() {

			try {
				
				//https://docs.oracle.com/javase/10/docs/api/java/io/FileInputStream.html
				/*
				 * A classse FileInputStream nos permite ler um fluxo de dados 
				 * contidos num arquivo, no nosso caso o db.properties
				 */
				FileInputStream fs = new FileInputStream("db.properties");
				//Cria��o do objeto props a ser retornado pelo met�do
				Properties props = new Properties();
				//leitura das propriedades do arquivo requerido
				props.load(fs);
				return props;
				//Poss�veis exce��es de entrada e sa�da de dados (IO)
				//https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/io/IOException.html
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new DbException(e.getMessage());
			}
				
		}
		
		//Met�do para fechar a conex�o
		public static void closeConnetion() {
			
				if (conn != null) {
					
					try {
						conn.close();
						
					}catch(SQLException e) {
						
						throw new DbException(e.getMessage());
					}
					
				}
			
		}
		
		//Met�do para fechar o ResultSet
		public static void closeResultset(ResultSet rs) {
			
				if (rs != null) {
					
					try {
						rs.close();
						
					}catch(SQLException e) {
						
						throw new DbException(e.getMessage());
					}
					
				}
			
		}
		
		// M�todo para fechar o Statement
		
		public static void closeStatement(Statement stmt ) {
			
			if (stmt != null) {
				
				try {
					stmt.close();
					
				}catch(SQLException e) {
					
					throw new DbException(e.getMessage());
				}
				
			}
		
	}
		
}
