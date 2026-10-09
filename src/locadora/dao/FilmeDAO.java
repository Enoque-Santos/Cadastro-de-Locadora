package locadora.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import locadora.model.Filme;


public class FilmeDAO {
	
	public void cadastrarFilme(Filme filme) throws ExceptionDAO{
		
		String sql = "INSERT INTO FILME (titulo, genero, sinopse, duracao) VALUES (?, ?, ?, ?)";
		
		PreparedStatement pStatement = null;
		Connection connection = null;
		
		
		try {
		
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setString(1,filme.getTitulo());
			pStatement.setString(2,filme.getGenero());
			pStatement.setString(3,filme.getSinopse());
			pStatement.setInt(4,filme.getDuracao());
			pStatement.execute();
		} catch (SQLException e) {
			throw new ExceptionDAO("Erro ao cadastrar filme:" + e);
		}finally {
			
			try {
				if(pStatement != null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				throw new ExceptionDAO("Erro ao fechar o Statement:" + e);
			}
			try {
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new ExceptionDAO("Erro ao fechar a conexão:" + e);
			}
		}
	}
	
	

}
