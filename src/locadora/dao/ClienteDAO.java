package locadora.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import locadora.model.Cliente;

public class ClienteDAO {

	public void cadastrarCliente(Cliente cliente) throws ExceptionDAO{
		
		String sql = "INSERT INTO CLIENTE (nome, cpf, email, endereco, dtNascimento) VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement  pStatement = null;
		Connection connection =  null;
		
		try {
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setString(1,cliente.getNome());
			pStatement.setString(2,cliente.getCpf());
			pStatement.setString(3,cliente.getEmail());
			pStatement.setString(4,cliente.getEndereco());
			// A data tem que ser tratada diferente apesar de termos o nosso metodo de data 
			// mas ela nao e o mesmo Date do SQL a data do SQL e em long por isso temos que pegar pelo getTime.	
			pStatement.setDate(5,new Date (cliente.getDtNascimento().getTime()));
			pStatement.execute();
		} catch (SQLException e) {
			throw new ExceptionDAO("Erro ao cadastrar cliente:" + e);
		} finally {
			try {
				if (pStatement != null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				throw new ExceptionDAO("Erro ao fechar o Statement:" + e);
			}
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new ExceptionDAO("Erro ao fechar a conexão:" + e);
			}
		}
	}

}