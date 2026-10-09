package locadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import locadora.model.Ator;

public class AtorDAO {

	public void cadastrarAtor(Ator ator) throws ExceptionDAO {

		String sql = "INSERT INTO ATOR (nome, nacionalidade) VALUES (?, ?)";

		PreparedStatement pStatement = null;
		Connection connection = null;

		try {

			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, ator.getNome());
			pStatement.setString(2, ator.getNacionalidade());

			pStatement.execute();
		} catch (SQLException e) {
			throw new ExceptionDAO("Erro ao cadastrar ator:" + e);
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
