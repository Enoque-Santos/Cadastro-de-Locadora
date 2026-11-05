package locadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import locadora.model.Filme;

public class FilmeDAO {

	public void cadastrarFilme(Filme filme) throws ExceptionDAO {

		String sql = "INSERT INTO FILME (titulo, genero, sinopse, duracao) VALUES (?, ?, ?, ?)";

		PreparedStatement pStatement = null;
		Connection connection = null;

		try {

			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, filme.getTitulo());
			pStatement.setString(2, filme.getGenero());
			pStatement.setString(3, filme.getSinopse());
			pStatement.setInt(4, filme.getDuracao());
			pStatement.execute();
		} catch (SQLException e) {
			throw new ExceptionDAO("Erro ao cadastrar filme:" + e);
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

	public ArrayList<Filme> listarFilmes(String nome) throws ExceptionDAO {

		String sql = "select * from FILME where titulo like '%" + nome + "%' order by titulo";
		Connection connection = null;
		PreparedStatement pStatement = null;
		ArrayList<Filme> filmes = null;

		try {
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			ResultSet rs = pStatement.executeQuery();

			if (rs != null) {
				filmes = new ArrayList<Filme>();
				while (rs.next()) {
					Filme filme = new Filme();

					filme.setCodFilme(rs.getInt("codFilme"));
					filme.setTitulo(rs.getString("titulo"));
					filme.setGenero(rs.getString("genero"));
					filme.setSinopse(rs.getString("sinopse"));
					filme.setDuracao(rs.getInt("duracao"));

					filmes.add(filme);

				}
			}
		} catch (SQLException e) {
			throw new ExceptionDAO("Erro ao consultar Filmes" + e);
		} finally {
			try {
				if (pStatement != null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				throw new ExceptionDAO("Erro ao fechar o pStatement;" + e);
			}
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				throw new ExceptionDAO("Erro ao fechar o conexão;" + e);
			}
		}

		return filmes;

	}

}
