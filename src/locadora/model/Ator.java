package locadora.model;

import java.util.ArrayList;

import locadora.dao.AtorDAO;
import locadora.dao.ExceptionDAO;

public class Ator {
	
	private Integer codAtor;
	private String nome;
	private String nacionalidade;
	private  ArrayList<Filme> filmes = new ArrayList<Filme>();
	
	public Ator() {
		
	}
	public Ator(String nome, String nacionalidade) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}
	
	public Integer getCodAtor() {
		return codAtor;
	}
	public void setCodAtor(Integer codAtor) {
		this.codAtor = codAtor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public ArrayList<Filme> getFilmes() {
		return filmes;
	}
	public void setFilmes(ArrayList<Filme> filmes) {
		this.filmes = filmes;
	}
	
	public void cadastrarAtor(Ator ator) throws ExceptionDAO {
		new AtorDAO().cadastrarAtor(ator);
	}
	

}
